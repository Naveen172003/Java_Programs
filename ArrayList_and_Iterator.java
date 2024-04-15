/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Naveen Raj. K
 */
public class ArrayList_and_Iterator {
    public static void main(String[] args) {
         ArrayList<Integer> al1=new ArrayList<>();
        
        ArrayList<Integer> al2=new ArrayList<>(Arrays.asList(60,70,80,90)); //List.of(60,70,80,90)
        
        al1.add(10);
        al1.add(20);
        al1.add(2,30);
        al1.addAll(al2);
      
         System.out.println("the list is"+al1);
         
         al1.set(6, 500);
         System.out.println("the list is"+al1);
         
        System.out.println("get value :"+al1.get(2));
        System.out.println("index value :"+al1.indexOf(70));
        System.out.println("lastIndex value :"+al1.lastIndexOf(80));
        
        System.out.println("the Iterator value of list is :");
        Iterator<Integer> iter=al1.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
    }
    System.out.println();
}
    
}
