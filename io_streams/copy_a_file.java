/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author Naveen Raj. K
 */
public class copy_a_file {
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception
    {
        try{
            FileInputStream fis=new FileInputStream("C:/Users/Naveen Raj. K/OneDrive/Desktop/java-practice/write.txt");
            FileInputStream fis1=new FileInputStream("C:/Users/Naveen Raj. K/OneDrive/Desktop/java-practice/aaa.txt");
            FileOutputStream fos=new FileOutputStream("C:/Users/Naveen Raj. K/OneDrive/Desktop/java-practice/mydata.txt");
            
            SequenceInputStream sis=new SequenceInputStream(fis,fis1);
            int x;
            
            while((x=sis.read())!=-1){
                
                    fos.write(x);
            }
            fis.close();
            fis1.close();
            fos.close();
                
            
            
        }
        catch(IOException e){
            System.out.println(e);
        }
           
    }
}
