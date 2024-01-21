package Controller.Interfaces;

import Model.Core.ComplexNumber;

/**
 * Интерфейс для выполнения операций с комплексными числами.
 */
public interface ComplexOperation {
    ComplexNumber performOperation(ComplexNumber operand1, ComplexNumber operand2);
}
