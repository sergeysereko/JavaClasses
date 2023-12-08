public class Fraction {
    private int numerator;
    private int  denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(int numerator) {
        this(numerator, 2);
    }

    public Fraction() {
        this(1);
    }

    public void inputFraction(int num, int denom){
        this.numerator = num;
        this.denominator = denom;
    }

    public void outputFraction(Fraction fraction) {
        System.out.println("Дробь : " + fraction.numerator + "/" + fraction.denominator);
    }

    // сложение
    public Fraction add(Fraction otherFraction) {
        int resultNumerator = this.numerator * otherFraction.denominator + otherFraction.numerator * this.denominator;
        int resultDenominator = this.denominator * otherFraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    // умножение
    public Fraction multiply(Fraction otherFraction) {
        int resultNumerator = this.numerator * otherFraction.numerator;
        int resultDenominator = this.denominator * otherFraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }


    // вычитание
    public Fraction subtract(Fraction otherFraction) {
        int resultNumerator = this.numerator * otherFraction.denominator - otherFraction.numerator * this.denominator;
        int resultDenominator = this.denominator * otherFraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    //деление
    public Fraction divide(Fraction otherFraction) {
        // Проверка деления на ноль
        if (otherFraction.numerator == 0) {
            throw new IllegalArgumentException("Делитель не может быть равен нулю");

        }

        int resultNumerator = this.numerator * otherFraction.denominator;
        int resultDenominator = this.denominator * otherFraction.numerator;
        return new Fraction(resultNumerator, resultDenominator);
    }


    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
