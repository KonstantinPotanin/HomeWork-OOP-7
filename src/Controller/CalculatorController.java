package Controller;

import Controller.Interfaces.ComplexOperation;
import Controller.Interfaces.OperationFactory;
import Controller.Interfaces.OperationType;
import Model.Core.ComplexNumber;
import View.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;

/**
 * Контроллер для управления взаимодействием между моделью и представлением калькулятора комплексных чисел.
 */
public class CalculatorController {
    private final CalculatorView view;
    public static final Logger logger = Logger.getLogger(CalculatorController.class.getName());

    /**
     * Конструктор
     * @param view Представление калькулятора.
     */
    public CalculatorController(CalculatorView view) {
        this.view = view;
        attachListeners();
    }

    static {
        // Настройка уровня логирования
        logger.setLevel(Level.ALL);

        // Добавление обработчика для вывода логов в консоль
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(consoleHandler);
    }

    /**
     * Подключает к кнопкам операций
     */
    private void attachListeners() {
        view.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(OperationType.ADDITION);
            }
        });

        view.getSubtractButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(OperationType.SUBTRACTION);
            }
        });

        view.getMultiplyButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(OperationType.MULTIPLICATION);
            }
        });

        view.getDivideButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation(OperationType.DIVISION);
            }
        });
    }

    /**
     * Выполняет выбранную операцию в зависимости от типа операции и логирование.
     * @param operationType Тип операции
     */
    private void performOperation(OperationType operationType) {
        try {
            ComplexNumber number1 = parseComplexNumber(view.getReal1TextField().getText(), view.getImaginary1TextField().getText());
            ComplexNumber number2 = parseComplexNumber(view.getReal2TextField().getText(), view.getImaginary2TextField().getText());

            OperationFactory operationFactory = new CalculatorOperationFactory(operationType);
            ComplexOperation operation = operationFactory.createOperation();

            ComplexNumber result = operation.performOperation(number1, number2);

            view.getResultLabel().setText("Result: " + result.toString());

            LoggingUtils.logOperationInfo(logger, operationType, number1, number2, result);


        } catch (NumberFormatException ex) {
            logger.log(Level.SEVERE, "Некорректный ввод.", ex);
            view.getResultLabel().setText("Некорректный ввод.");
        }
    }

    /**
     * Преобразует данные из текстовых полей в комплексное число.
     * @param realText Текстовое представление вещественной части.
     * @param imaginaryText Текстовое представление мнимой части.
     * @return Комплексное число, созданное из текстовых данных.
     * @throws NumberFormatException Если введенные данные не являются числами.
     */
    private ComplexNumber parseComplexNumber(String realText, String imaginaryText) throws NumberFormatException {
        double real = Double.parseDouble(realText);
        double imaginary = Double.parseDouble(imaginaryText);
        return new ComplexNumber(real, imaginary);
    }
}