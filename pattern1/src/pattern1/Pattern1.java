/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pattern1;

import static java.lang.System.out;

/**
 *
 * @author Naveen Raj. K
 */
public class Pattern1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
               {
                   out.format(" "+j);
                }
            out.println("");
        }

    }
}
    

