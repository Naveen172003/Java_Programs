/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io_streams;

import java.io.*;



/**
 *
 * @author Naveen Raj. K
 */

public class buffered_streams_and_buffered_reader {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try{
            
            FileInputStream fis=new FileInputStream("C:/Users/Naveen Raj. K/OneDrive/Desktop/java-practice/write.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            
            System.out.println(bis.markSupported());
            
            bis.skip(5);
           
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
           
            System.out.println((char)bis.read());
            
            bis.close();
            fis.close();
              
        }
        catch(IOException e){
            System.out.println(e);
        }
           
    }
    
}
