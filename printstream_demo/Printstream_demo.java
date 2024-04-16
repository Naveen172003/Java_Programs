/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstream_demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */


public class Printstream_demo {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static class reader{
        public static void main(String[] args){
        try{
        FileInputStream fis=new FileInputStream("C:\\Users\\Naveen Raj. K\\OneDrive\\Desktop\\java-practice\\student.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        
        Student s=new Student();
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();
        
        System.out.println("rollno :"+s.rollno);
        System.out.println("name :"+s.name);
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
        PrintStream ps=new PrintStream(fos);
        
        Student s=new Student();
        s.rollno=10;
        s.name="Serkanbolat";
        s.dept="CSE";
        
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
        
        ps.close();
    
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
