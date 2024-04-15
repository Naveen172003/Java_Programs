/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern3;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Pattern3 {

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
            for(j=1;j<=n-i+1;j++)
            {
               System.out.print(j+"");
            }
            
            System.out.println();
        }
    }
    
}
