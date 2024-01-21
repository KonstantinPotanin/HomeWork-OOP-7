package Controller;

import Controller.Interfaces.ComplexOperation;
import Controller.Interfaces.OperationFactory;
import Controller.Interfaces.OperationType;
import Model.AdditionOperation;
import Model.DivisionOperation;
import Model.MultiplicationOperation;
import Model.SubtractionOperation;

/**
 * Фабрика операций для создания экземпляров операций в зависимости от типа операции.
 */
public class CalculatorOperationFactory implements OperationFactory {

    private final OperationType operationType;

    /**
     * Конструктор
     * @param operationType тип операции
     */
    public CalculatorOperationFactory(OperationType operationType) {
        this.operationType = operationType;
    }

    /**
     * Создает и возвращает экземпляр операции в соответствии с заданным типом.
     * @return Экземпляр операции.
     */
    @Override
    public ComplexOperation createOperation() {
        switch (operationType) {
            case ADDITION:
                return new AdditionOperation();
            case SUBTRACTION:
                return new SubtractionOperation();
            case MULTIPLICATION:
                return new MultiplicationOperation();
            case DIVISION:
                return new DivisionOperation();
            default:
                throw new IllegalArgumentException("Unsupported operation type");
        }
    }
}
