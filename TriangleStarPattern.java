/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle.star.pattern;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class TriangleStarPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner p=new Scanner(System.in);
        System.out.print("enter no:");
        int n=p.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
               {
                   out.print(" ");
                }
            for(int k=1;k<=i;k++)
               {
                   out.print(k+" ");
                }
            out.println(" ");
        }
     
    }
    
}
