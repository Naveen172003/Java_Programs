/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package removeduplicates;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class RemoveDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Get array elements from user
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call removeDuplicates method
        int[] result = remove_duplicate_in_array.removeDuplicates(arr);

        // Display the array without duplicates
        System.out.println("Array without duplicates:");
        System.out.println(Arrays.toString(result));
    }
    
}
