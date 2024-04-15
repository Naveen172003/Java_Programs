/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.number.triangle.pattern;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class ReverseNumberTrianglePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print numbers in reverse order
            for (int k = i; k <= n; k++) {
                System.out.print( "*");
            }

            System.out.println();
        }
        
    }
    
}
