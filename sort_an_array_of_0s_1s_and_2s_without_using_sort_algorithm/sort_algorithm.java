/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort_an_array_of_0s_1s_and_2s_without_using_sort_algorithm;

/**
 *
 * @author Naveen Raj. K
 */
public class sort_algorithm {
    public static void sort012(int a[], int n)
    {
       int low=0;
       int mid=0;
        int high=n-1;
        
        int temp=0;
        while(mid<=high){
            switch(a[mid]){
                case 0:
                    temp=a[low];
                     a[low]=a[mid];
                     a[mid]=temp;
                     low++;
                     mid++;
                     break;
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    temp=a[mid];
                     a[mid]=a[high];
                     a[high]=temp;
                     high--;
                     break;
            }
        }
        
         
    }
}
