/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sort_an_array_of_0s_1s_and_2s_without_using_sort_algorithm;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Sort_an_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array (0, 1, or 2): ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        //sort_algorithm sa=new sort_algorithm();
        sort_algorithm.sort012(nums, n);

        System.out.println("Sorted Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
    
}
