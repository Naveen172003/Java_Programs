/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.io.FileInputStream;
import java.util.ArrayList;

/**
 *
 * @author Naveen Raj. K
 */
public class StringTokenizer {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception
    {
        FileInputStream fis=new FileInputStream ("C:\\Users\\Naveen Raj. K\\OneDrive\\Desktop\\java-practice\\mydata.txt");
        byte b[]=new byte[fis.available()];
        fis.read(b);
        String data=new String(b);
        //String data=("Name=Serkan;Address=Tamil Nadu;country=India;Dept=CSE;");
        java.util.StringTokenizer stk=new java.util.StringTokenizer(data,",=/");
        String s;
        ArrayList<Integer> al=new ArrayList<>();
        System.out.print("the StringTokenizer elements are:");
        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.print(s+" ");
            al.add(Integer.valueOf(s));
            
        }
        System.out.print("\n");
        System.out.println("StringTokenizer stored in arraylist :");
        System.out.print(al);
        
    }
}
