package Lab1;

import java.util.Scanner;
class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getters
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the real part of the complex number
        System.out.print("Enter the real part of the complex number: ");
        double realPart = scanner.nextDouble();

        // Prompt the user to enter the imaginary part of the complex number
        System.out.print("Enter the imaginary part of the complex number: ");
        double imaginaryPart = scanner.nextDouble();

        // Create the complex number object
        ComplexNumber complexNumber = new ComplexNumber(realPart, imaginaryPart);

        // Print the complex number
        System.out.println("Complex Number: " + complexNumber);

        // Close the scanner
        scanner.close();
    }
}

