/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package search_numbers_within_range;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Search_numbers_within_range {

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
        
        System.out.print("Enter the index to search : ");
        int start = sc.nextInt();
        System.out.print("Enter the end index to stop the search : ");
        int end = sc.nextInt();
        
        int result=search(nums,target,start,end);
        System.out.print("the value is found at the index of position : "+result);
        System.out.println();
    }
    static int search(int[] nums1, int target,int start,int end){
        if(nums1.length==0){
            return -1;
        }
        for(int index=start;index<=end;index++){
            int element=nums1[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
//Search_numbers_within_range