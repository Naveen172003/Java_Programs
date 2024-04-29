/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptions_in_java;

/**
 *
 * @author Naveen Raj. K
 */
public class Exception_for_toString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b); 
        }
        catch(ArithmeticException e){
            System.out.println(e.toString()); 
        }
    }
    
}
