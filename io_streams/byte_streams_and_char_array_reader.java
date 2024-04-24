/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io_streams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 *
 * @author Naveen Raj. K
 */
public class byte_streams_and_char_array_reader {
    public static void main(String[] args)
    {
        //input Stream
        try{
            byte b[]={'a','b','c','d','e','f'};
            ByteArrayInputStream bis=new ByteArrayInputStream(b);
            
            int x;
            
            while((x=bis.read())!=-1){
                
                   System.out.println((char)x);
            }
            bis.close();
              
        }
        catch(IOException e){
            System.out.println(e);
        }
           
    }
}
//output Stream
/*public static void main(String[] args)
    {
        try{
            
            ByteArrayOutputStream bos=new ByteArrayOutputStream(20);
            bos.write('a');
            bos.write('b');
            bos.write('c');
            bos.write('d');
            bos.write('e');
            bos.write('f');
            
            byte b[]=bos.toByteArray();
            for(int x:b)
                System.out.println((char)x);
            
            bos.writeTo(new FileOutputStream("C:/Users/Naveen Raj. K/OneDrive/Desktop/java-practice/write.txt"));
            
            //Char Array Reader
            char c[]={'w','e','r','t','y','u'};
            CharArrayReader cr=new CharArrayReader(c);
            
            int x;
            
            while((x=cr.read())!=-1){
                
                   System.out.println((char)x);
            }
            bos.close();
              
        }
        catch(IOException e){
            System.out.println(e);
        }
           
    }*/
