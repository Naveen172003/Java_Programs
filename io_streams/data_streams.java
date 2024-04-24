/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io_streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */

class Student {
    int rollno;
    String name;
    float avg;
    String dept;
}


public class data_streams {
    public static class reader{
        public static void main(String[] args){
        try{
        FileInputStream fis=new FileInputStream("C:\\Users\\Naveen Raj. K\\OneDrive\\Desktop\\java-practice\\student.txt");
        DataInputStream ds=new DataInputStream(fis);
        
        Student s=new Student();
        s.rollno=ds.readInt();
        s.name=ds.readUTF();
        s.avg=ds.readFloat();
        s.dept=ds.readUTF();
        
        System.out.println("rollno :"+s.rollno);
        System.out.println("name :"+s.name);
        System.out.println("Average :"+s.avg);
        System.out.println("dept :"+s.dept);
       
       
    }
    catch(IOException e)
    {
        System.out.println(e);
    }
  }
}
public static class writer{
    public static void main(String[] args){
    try{
    
        FileOutputStream fos=new FileOutputStream("C:/Users/Naveen Raj. K/OneDrive/Desktop/java-practice/student.txt");
        DataOutputStream ds=new DataOutputStream(fos);
        
        Student s=new Student();
        s.rollno=10;
        s.name="Serkanbolat";
        s.dept="CSE";
        s.avg=80.5f;
        
        
        ds.writeInt(s.rollno);
        ds.writeUTF(s.name);
        ds.writeFloat(s.avg);
        ds.writeUTF(s.dept);
        
        ds.close();
        fos.close();
    
   }
    catch(IOException e)
    {
        System.out.println(e);
    
    }
   }
}
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        boolean file=true;
        while(file){
            System.out.println("Enter 1 to read from file, 2 to write to file, 3 to exit:");
            
            System.out.println("Enter number :");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    writer.main(args);
                    System.out.println("Data Stored Successfully in file.");
                    System.out.println("\n");
                    break;
                case 2:
                    reader.main(args);
                    System.out.println("Data readed Successfully in file.");
                    System.out.println("\n");
                    break;   
                case 3:
                    file = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
            
            
        }
        
    }

    
}
