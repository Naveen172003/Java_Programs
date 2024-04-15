/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern2;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Pattern2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("enter no:");
        int n=p.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
               System.out.print("");
            }
            for( k=1;k<=i;k++)
            {
               System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
/*for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
               {
                   if(i+j>5)
                   {
                       System.out.print("*");
                   }
                   else
                       System.out.print(" ");
                }
            out.println(" ");
        }*/