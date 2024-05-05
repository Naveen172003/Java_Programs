/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package search_number_using_linearsearch;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Search_Number_using_LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length : ");
        int length = sc.nextInt();
        int[] nums = new int[length];
        System.out.println("Enter the elements:");
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the value to search : ");
        int target = sc.nextInt();
        
        int result=linearsearch(nums,target);
        System.out.print("the value is found at the index of position : "+result);
        System.out.println();
        
    }
    static int linearsearch(int[] nums1, int target){
        if(nums1.length==0){
            return -1;
        }
        for(int index=0;index<nums1.length;index++){
            int element=nums1[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
