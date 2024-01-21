import Controller.CalculatorController;
import View.CalculatorView;

import javax.swing.*;

/**
 * Класс приложения, запускающий калькулятор комплексных чисел.
 */
public class CalculatorApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CalculatorView view = new CalculatorView();
                CalculatorController controller = new CalculatorController(view);
            }
        });
    }
}
