/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;

/**
 *
 * @author Naveen Raj. K
 */
public class sorting_array_of_strings {
    public static void main(String[] args)
    {
        
        String[] m1 ={"India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands"} ;
        int n=m1.length;
        int i,j;
        for(i=0;i<n-1;i++){
           for(j=i+1;j<n;j++)
           {
               if(m1[i].compareTo(m1[j])>0)
               {
                   String temp;
                   temp=m1[i];
                   m1[i]=m1[j];      
                   m1[j]= temp;
               }
           }
        }
        
        System.out.print("After Sorting the Array:"+Arrays.toString(m1));
        System.out.print("\n");
    }
}


/*int[] arr = new int[] {7,8,3,4, 1, 2, 90, 34, 55, 20,5};  
         System.out.println("Array elements after sorting:");  
         int n=  arr.length;
         for (int i = 0; i < n; i++)   
          {  
           for (int j = i + 1; j < n; j++)   
             {  
               int temp = 0;  
               if (arr[i] > arr[j])   
               {  
                  temp = arr[i];  
                  arr[i] = arr[j];  
                  arr[j] = temp;  
               }  
             }  
 
                  System.out.println(arr[i]);  
          }*/