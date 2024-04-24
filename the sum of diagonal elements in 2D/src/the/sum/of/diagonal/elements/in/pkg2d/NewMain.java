/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package the.sum.of.diagonal.elements.in.pkg2d;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols=sc.nextInt();
        int [][] arr=new int[rows][cols];
        System.out.print("Enter the Array numbers: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
              arr[i][j]=sc.nextInt();
            }
         }
        Exercise num=new Exercise();
        int sumdiagonal=num.sumDiagonalElements(arr);
        System.out.println("Sum of diagonal elements: "+sumdiagonal);
        
        
    }
    
}
