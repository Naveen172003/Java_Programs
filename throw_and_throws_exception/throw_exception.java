/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package throw_and_throws_exception;

import static throw_and_throws_exception.Throw.fun;

/**
 *
 * @author Naveen Raj. K
 */
public class throw_exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            fun();
        }
        catch (NullPointerException e) {
            System.out.println("Caught in main.");
        }
    }
}
class Throw {
    static void fun()
    {
        try {
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside fun");
            throw e; // rethrowing the exception
        }
    }
}
