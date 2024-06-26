
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Naveen Raj. K
 */
public class Binary_search 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] arr={4,5,6,7,8,9,12,43,55};
        //int[] arr={84,82,81,65,60,55};
        int tar=7;
        int ans=binarysearch(arr,tar);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr,int tar)
    {
        
        int start=0;
        int end=arr.length-1;
        int mid;
        //maybe array values in assending order or desending order
        boolean isordered=arr[start]<arr[end];
         while(start<=end)
         {
            mid=start+(end-start)/2;
            if (arr[mid] == tar) {
                return mid;
            }
        
            if(isordered)
            {
            if(tar < arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            }
            else{
            if(tar > arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
         }
        
            
        }
    return -1;
    }
    
}
