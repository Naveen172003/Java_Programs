/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Naveen Raj. K
 */
public class Adding_matrices_in_2dArray {
    //adding two matrices in 2d array
    public static void main(String[] args)
    {
        
        int[][] m1 ={{1,2,3},{4,5,6,}} ;
        
        int[][] m2 = {{4,5,6,},{1,2,3}};
        int[][] m3=new int[2][3];
        
        for(int i=0;i<m1.length;i++)
        {
            for(int j=0;j<m1[i].length;j++)
            {
                m3[i][j]=m1[i][j]+m2[i][j];
            }
        }
        for(int i=0;i<m3.length;i++)
        {
            for(int j=0;j<m3[i].length;j++)
            {
                System.out.print(m3[i][j]+" ");
            }
            System.out.print("\n");
        }
        
       
    }
}
