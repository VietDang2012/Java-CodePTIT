package J04018;

public class ComplexNumber {
    private int real, imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber x) {
        int newReal = this.real + x.real;
        int newImaginary = this.imaginary + x.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber x) {
        int newReal = (this.real * x.real) - (this.imaginary * x.imaginary);
        int newImaginary = (this.real * x.imaginary) + (this.imaginary * x.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber square() {
        return this.multiply(this);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}