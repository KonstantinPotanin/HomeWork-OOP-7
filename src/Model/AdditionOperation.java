package Model;

import Controller.Interfaces.ComplexOperation;
import Model.Core.ComplexNumber;

import java.util.logging.Level;

import static Controller.CalculatorController.logger;

/**
 * Реализация операции сложения для комплексных чисел.
 */
public class AdditionOperation implements ComplexOperation {
    /**
     * Выполняет операцию сложения над двумя комплексными числами.
     * @param number1 Первое комплексное число.
     * @param number2 Второе комплексное число.
     * @return Результат сложения.
     */
    @Override
    public ComplexNumber performOperation(ComplexNumber number1, ComplexNumber number2) {
        return new ComplexNumber(number1.getReal() + number2.getReal(), number1.getImaginary() + number2.getImaginary());
    }
}
