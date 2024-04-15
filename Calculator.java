/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_quiz2;

/**
 *
 * @author Naveen Raj. K
 */
import java.util.Scanner;

public class Calculator 
{
    public int multiply(int a, int b) 
    {
        return a * b;
    }

    public double multiply(double x, double y, double z) 
    {
        return x * y * z;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int resultInt = calculator.multiply(num1, num2);
        System.out.println("Result of multiplying two integers: " + resultInt);

        System.out.println();
        System.out.print("Enter the first double: ");
        double double1 = scanner.nextDouble();

        System.out.print("Enter the second double: ");
        double double2 = scanner.nextDouble();

        System.out.print("Enter the third double: ");
        double double3 = scanner.nextDouble();

        double resultDouble = calculator.multiply(double1, double2, double3);
        System.out.println("Result of multiplying three doubles: " + resultDouble);


        scanner.close();
    }
}
