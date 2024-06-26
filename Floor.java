/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Naveen Raj. K
 */
public class Floor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int[] arr={4,5,6,7,8,9,12,43,55};
        
        int tar=10;
        int ans=findFloor(arr,tar);
        System.out.println(ans);
    }
    static int findFloor(int[] arr,int tar)
    {
        
        int start=0;
        int end=arr.length-1;
        int mid;
        /*maybe array values is not found when the while loop condition voilated then display greatest smaller number or = to target*/
        
         while(start<=end)
         {
            mid=start+(end-start)/2;
            if (arr[mid] == tar) {
                return mid;
            }
        
            
            else if(tar < arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        
            
        }
    return end;
    }
    
}
