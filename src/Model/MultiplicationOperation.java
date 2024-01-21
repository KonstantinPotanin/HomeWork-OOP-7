package Model;

import Controller.Interfaces.ComplexOperation;
import Model.Core.ComplexNumber;

/**
 * Реализация операции умножения для комплексных чисел.
 */
public class MultiplicationOperation implements ComplexOperation {
    /**
     * Выполняет операцию умножения над двумя комплексными числами.
     * @param number1 Первое комплексное число.
     * @param number2 Второе комплексное число.
     * @return Результат сложения.
     */
    @Override
    public ComplexNumber performOperation(ComplexNumber number1, ComplexNumber number2) {
        double newReal = number1.getReal() * number2.getReal() - number1.getImaginary() * number2.getImaginary();
        double newImaginary = number1.getReal() * number2.getImaginary() + number1.getImaginary() * number2.getReal();
        return new ComplexNumber(newReal, newImaginary);
    }
}
