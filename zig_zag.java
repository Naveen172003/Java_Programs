/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;
import java.util.Scanner;
/**
 *
 * @author Naveen Raj. K
 */
public class zig_zag {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        verticalPrint(inputString);
        scanner.close();
    }
    private static void verticalPrint(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(currentChar);
        }
    }
}