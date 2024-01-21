package Controller.Interfaces;

import javax.swing.*;

/**
 * Интерфейс для представления калькулятора комплексных чисел.
 */
public interface CalculatorViewInterface {
    void setResultLabelText(String text);
    JButton getAddButton();
    JButton getSubtractButton();
    JButton getMultiplyButton();
    JButton getDivideButton();
    JTextField getReal1TextField();
    JTextField getImaginary1TextField();
    JTextField getReal2TextField();
    JTextField getImaginary2TextField();
}
