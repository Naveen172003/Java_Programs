/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io_streams;

import java.io.File;

/**
 *
 * @author Naveen Raj. K
 */
public class file_class {
    public static void main(String[] args)
    {
        try{
           File f=new File("C:\\Users\\Naveen Raj. K");
           System.out.println(f.isDirectory());
           File list[]=f.listFiles();
           
           for(File x:list){
               System.out.println(x.getName()+" ");
               System.out.println(x.getPath());
           
           }
         
               //System.out.println((char)rf.read());
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
