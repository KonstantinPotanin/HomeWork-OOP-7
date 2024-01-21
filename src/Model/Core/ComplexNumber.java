package Model.Core;

/**
 * Класс, представляющий комплексное число с вещественной и мнимой частями.
 */
public class ComplexNumber {
    private double real;
    private double imaginary;

    /**
     * Конструктор
     * @param real  вещественная часть
     * @param imaginary  мнимая часть
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * @return Строковое представление комплексного числа.
     */
    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
