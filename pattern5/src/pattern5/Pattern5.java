/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern5;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Pattern5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=0;
        Scanner p=new Scanner(System.in);
        System.out.println("enter no:");
        int n=p.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
               {
                   count++;
                   out.format("%02d",count);
                   out.print(" ");
                }
            out.println(" ");
        }
    }
    
}
