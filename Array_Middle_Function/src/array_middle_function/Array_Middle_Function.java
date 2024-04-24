/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_middle_function;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Array_Middle_Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Array Elements");
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter Array elements "+(i+1)+" :");
            array[i]=sc.nextInt();
        }
        Middle_Function mid=new Middle_Function();
        int[] res=mid.middle(array);
        
        //  int[] res=Middle_Function.middle(array);
        
        System.out.print(Arrays.toString(res));
        

        
        
    }
    
}
