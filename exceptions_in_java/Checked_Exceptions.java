/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptions_in_java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Naveen Raj. K
 */
public class Checked_Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C:/Users/Naveen Raj. K/OneDrive/Documents/NetBeansProjects/Exceptions_in_Java/src/exceptions_in_java/fi.txt");
            BufferedReader br = new BufferedReader(file);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
        
    }
    
}
