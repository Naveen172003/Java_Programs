/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kth_max_and_min_element_of_an_array;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Kth_max_and_min_element {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();
        Solution sol=new Solution();
        System.out.println("The " + k + "th smallest element is: " + sol.kthSmallest(arr, 0, arr.length - 1, k));
        scanner.close();
    }
    
}
