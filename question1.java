/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author Naveen Raj. K
 */

import java.util.Scanner;

public class question1 {

  public static void main(String[] args) {
            
    Scanner myObj = new Scanner(System.in);
    System.out.println("a)Enter the integer and Display it");
    System.out.println("");
    System.out.println("Enter the integer:");
    
    String integer=myObj.nextLine();
    System.out.println("The integer is:"+integer);
    System.out.println("");
    System.out.println("b) Add two float numbers");
    System.out.println("Enter the first float:");
    float float1=myObj.nextFloat();
    System.out.println("Enter the second float:");
    float float2=myObj.nextFloat();
    float average=(float1+float2)/2;
    System.out.printf("The average is: %.2f%n", average);
    
    }
    
}

