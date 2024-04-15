/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern4;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Pattern4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("enter no:");
        int n=p.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if((j>=i)||(i<=j))
                    System.out.print("*");
                else
                    System.out.print(" ");
               
            }
            
            System.out.println();
        }
    }
    
}
