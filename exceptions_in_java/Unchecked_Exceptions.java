/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptions_in_java;

/**
 *
 * @author Naveen Raj. K
 */
public class Unchecked_Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //arithmetric Exception
        int res=10/0;
        
        //NullPointer Exception
        String str=null;
        System.out.println(str.length());
        
        //ArrayIndexOutOfBounds Exception
        int[] ar=new int[5];
        System.out.println(ar[5]);
        
        //NumberFormat Exception
        String num="abc";
        int nm=Integer.parseInt(num);
        
      
    }
    
}
