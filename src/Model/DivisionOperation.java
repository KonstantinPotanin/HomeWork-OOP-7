package Model;

import Controller.Interfaces.ComplexOperation;
import Model.Core.ComplexNumber;

/**
 * Реализация операции деления для комплексных чисел.
 */
public class DivisionOperation implements ComplexOperation {
    /**
     * Выполняет операцию деления над двумя комплексными числами.
     * @param number1 Первое комплексное число.
     * @param number2 Второе комплексное число.
     * @return Результат сложения.
     */
    @Override
    public ComplexNumber performOperation(ComplexNumber number1, ComplexNumber number2) {
        double denominator = number2.getReal() * number2.getReal() + number2.getImaginary() * number2.getImaginary();
        double newReal = (number1.getReal() * number2.getReal() + number1.getImaginary() * number2.getImaginary()) / denominator;
        double newImaginary = (number1.getImaginary() * number2.getReal() - number1.getReal() * number2.getImaginary()) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }
}
