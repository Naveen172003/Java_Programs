/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package max_product_of_two_integers;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Max_Product_of_two_Integers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] intArray = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        
        Max_Product maxproduct=new Max_Product();
        
         String result = maxproduct.Product(intArray);
        
        System.out.println("Pair with maximum product: " + result);
    }
    
}
