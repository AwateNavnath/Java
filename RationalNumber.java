class RationalNumber {
    private int numerator;
    private int denominator;

   
    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); // Reduce the fraction to its simplest form
    }

    // Addition
    public RationalNumber add(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Subtraction
    public RationalNumber subtract(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Multiplication
    public RationalNumber multiply(RationalNumber other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    // Method to reduce the fraction to its simplest form
    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    // Helper method to calculate the Greatest Common Divisor (GCD)
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Main method for testing
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(1, 2); // 1/2
        RationalNumber r2 = new RationalNumber(1, 3); // 1/3

        RationalNumber sum = r1.add(r2);
        RationalNumber difference = r1.subtract(r2);
        RationalNumber product = r1.multiply(r2);

        System.out.println("Sum: " + sum);            // Output: 5/6
        System.out.println("Difference: " + difference);  // Output: 1/6
        System.out.println("Product: " + product);    // Output: 1/6
    }
}
