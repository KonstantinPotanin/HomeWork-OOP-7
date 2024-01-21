package Controller;

import Controller.Interfaces.OperationType;
import Model.Core.ComplexNumber;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Утилиты для логирования информации об операциях.
 */
public class LoggingUtils {
    /**
     * Логирует информацию о выполненной операции.
     * @param logger Логгер.
     * @param operationType Тип операции.
     * @param number1 Первое комплексное число.
     * @param number2 Второе комплексное число.
     * @param result Результат операции.
     */
    public static void logOperationInfo(Logger logger, OperationType operationType, ComplexNumber number1, ComplexNumber number2, ComplexNumber result) {
        logger.log(Level.INFO, "Performed operation: {0}", operationType);
        logger.log(Level.FINE, "Number 1: {0}", number1);
        logger.log(Level.FINE, "Number 2: {0}", number2);
        logger.log(Level.FINE, "Result: {0}", result);
    }
}
