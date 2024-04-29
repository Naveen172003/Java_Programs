/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package throw_and_throws_exception;

import static throw_and_throws_exception.function.shows;

/**
 *
 * @author Naveen Raj. K
 */
public class throws_exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            shows();
        }
        catch(IllegalAccessException e){
            System.out.println("caught in main");
        }
    }
    
}
class function{
    public static void shows()throws IllegalAccessException{
        System.out.println("Inside method ");
        throw new IllegalAccessException("ERROR");
    }
}
