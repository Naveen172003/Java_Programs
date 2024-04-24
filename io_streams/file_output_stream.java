/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io_streams;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Naveen Raj. K
 */
public class file_output_stream {
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception
    {
        try{
            FileOutputStream fos=new FileOutputStream("C:/Users/Naveen Raj. K/OneDrive/Desktop/java-practice/write.txt",true);
            String str="Learn Java Programming";
            
            //fos.write(str.getBytes());
            
            /*byte b[]=str.getBytes();
            for(byte x:b){
                fos.write(x);
            }*/
            
            byte b[]=str.getBytes();
            fos.write(b);
            
        }
        catch(IOException e){
            System.out.println(e);
        }
           
    }
}
