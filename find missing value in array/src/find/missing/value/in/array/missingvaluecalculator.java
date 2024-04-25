/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package find.missing.value.in.array;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class missingvaluecalculator {

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
        
        int res=missing_value.findmissingvalue(array);
        System.out.println("Missing Elements in the Array : "+res);
    }
    
}
