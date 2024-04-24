/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io_streams;

import java.io.*;
import java.io.IOException;

/**
 *
 * @author Naveen Raj. K
 */
public class file_input_stream_and_file_reader {
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception
    {
        try{
            //FileInputStream fis=new FileInputStream("C:/Users/Naveen Raj. K/OneDrive/Desktop/java-practice/write.txt");
            //or
            FileReader fis=new FileReader("C:/Users/Naveen Raj. K/OneDrive/Desktop/java-practice/write.txt");
            
           /* byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println(str);*/
            
            int x;
            // or
            /*do{
                x=fis.read();
                if(x!=-1)
                    System.out.println((char)x);
            }while(x!=-1);*/
            
            // or
            while((x=fis.read())!=-1)
                System.out.println((char)x);
            
            
        }
        catch(IOException e){
            System.out.println(e);
        }
           
    }
}
