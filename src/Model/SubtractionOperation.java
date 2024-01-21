package Model;

import Controller.Interfaces.ComplexOperation;
import Model.Core.ComplexNumber;

/**
 * Реализация операции вычитания для комплексных чисел.
 */
public class SubtractionOperation implements ComplexOperation {
    /**
     * Выполняет операцию вычитания над двумя комплексными числами.
     * @param number1 Первое комплексное число.
     * @param number2 Второе комплексное число.
     * @return Результат сложения.
     */
    @Override
    public ComplexNumber performOperation(ComplexNumber number1, ComplexNumber number2) {
        return new ComplexNumber(number1.getReal() - number2.getReal(), number1.getImaginary() - number2.getImaginary());
    }
}
