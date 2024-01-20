package J04004;

public class Fraction {
    private long numerator, denominator;

    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getNumerator() {
        return numerator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public long getDenominator() {
        return denominator;
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public void reduceFraction() {
        long GCD = gcd(this.numerator, this.denominator);

        this.numerator /= GCD;
        this.denominator /= GCD;
    }

    public void fractionSum(Fraction A) {
        this.numerator = (this.numerator * A.denominator) + (A.numerator * this.denominator);
        this.denominator = this.denominator * A.denominator;
        this.reduceFraction();
    }
}
