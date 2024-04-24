/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */

class Student implements Serializable {
    int rollno;
    String name;
    float avg;
    String dept;
    public Student(int rol,String na,float av,String dep){
        rollno=rol;
        name=na;
        avg=av;
        dept=dep;
    }
    @Override
    public String toString(){
        return "\nStudent Details\n"+
                "\nrollno :"+rollno+
                "\nname :"+name+
                "\nAverage :"+avg+
                "\ndept :"+dept;
    }
}
public class object_streams_and_serialisation {
    public static class reader{
        public static void main(String[] args)throws Exception{
        try{
        FileInputStream fis=new FileInputStream("C:\\Users\\Naveen Raj. K\\OneDrive\\Desktop\\java-practice\\student.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student s=(Student)ois.readObject();
        
        System.out.println(s);
        fis.close();
        ois.close();
       
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
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Student s=new Student(10,"Serkanbolat",80.5f,"CSE");
     
        oos.writeObject(s);
        
        fos.close();
        oos.close();
        
    
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
