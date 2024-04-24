/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io_streams;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Naveen Raj. K
 */
public class random_access_file {
    public static void main(String[] args)
    {
        try{
           RandomAccessFile rf=new RandomAccessFile("C:\\Users\\Naveen Raj. K\\OneDrive\\Desktop\\java-practice\\my.txt","rw");
          System.out.println((char)rf.read());
          System.out.println((char)rf.read());
          System.out.println((char)rf.read());
          rf.write('d');
          System.out.println((char)rf.read());
          rf.skipBytes(2);
           System.out.println((char)rf.read());
           rf.seek(3);
            System.out.println((char)rf.read());
             System.out.println((char)rf.read());
              System.out.println(rf.getFilePointer());
              rf.seek(rf.getFilePointer()+3);
               System.out.println((char)rf.read());
        }
        catch(IOException e){
            System.out.print(e);
        }
    }
}
