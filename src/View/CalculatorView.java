package View;

import Controller.Interfaces.CalculatorViewInterface;

import javax.swing.*;
import java.awt.*;

/**
 * Представление калькулятора комплексных чисел с графическим интерфейсом.
 */
public class CalculatorView implements CalculatorViewInterface {
    private JFrame frame;
    private JTextField real1TextField;
    private JTextField imaginary1TextField;
    private JTextField real2TextField;
    private JTextField imaginary2TextField;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JLabel resultLabel;
    private static final String RESULT_LABEL_PREFIX = "Result: ";

    /**
     * Конструктор класса CalculatorView. Инициализирует графический интерфейс и компоненты.
     */
    public CalculatorView() {
        frame = new JFrame("Калькулятор комплексных чисел");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(9, 2));

        real1TextField = new JTextField();
        imaginary1TextField = new JTextField();
        real2TextField = new JTextField();
        imaginary2TextField = new JTextField();

        addButton = new JButton("Сложение");
        subtractButton = new JButton("Вычитание");
        multiplyButton = new JButton("Умножение");
        divideButton = new JButton("Деление");

        resultLabel = new JLabel("Результат: ");

        frame.add(new JLabel("Вещественная часть 1:"));
        frame.add(real1TextField);
        frame.add(new JLabel("Мнимая часть 1:"));
        frame.add(imaginary1TextField);
        frame.add(new JLabel("Вещественная часть 2:"));
        frame.add(real2TextField);
        frame.add(new JLabel("Мнимая часть 2:"));
        frame.add(imaginary2TextField);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    /**
     * Возвращает текстовое поле для ввода вещественной части первого комплексного числа.
     */
    public JTextField getReal1TextField() {
        return real1TextField;
    }

    /**
     * Возвращает текстовое поле для ввода мнимой части первого комплексного числа.
     */
    public JTextField getImaginary1TextField() {
        return imaginary1TextField;
    }

    /**
     * Возвращает текстовое поле для ввода вещественной части второго комплексного числа.
     */
    public JTextField getReal2TextField() {
        return real2TextField;
    }

    /**
     * Возвращает текстовое поле для ввода мнимой части второго комплексного числа.
     */
    public JTextField getImaginary2TextField() {
        return imaginary2TextField;
    }

    /**
     * Возвращает кнопку для выполнения операции сложения.
     */
    @Override
    public JButton getAddButton() {
        return addButton;
    }

    /**
     * Возвращает кнопку для выполнения операции вычитания.
     */
    @Override
    public JButton getSubtractButton() {
        return subtractButton;
    }

    /**
     * Возвращает кнопку для выполнения операции умножения.
     */
    @Override
    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    /**
     * Возвращает кнопку для выполнения операции деления.
     */
    @Override
    public JButton getDivideButton() {
        return divideButton;
    }

    /**
     * Возвращает метку для отображения результата операции.
     */
    public JLabel getResultLabel() {
        return resultLabel;
    }

    /**
     * Устанавливает текст для метки результата.
     */
    @Override
    public void setResultLabelText(String text) {
        resultLabel.setText(RESULT_LABEL_PREFIX + text);
    }
}
