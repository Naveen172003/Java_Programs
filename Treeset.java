/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.util.Arrays;
import java.util.TreeSet;

/**
 *
 * @author Naveen Raj. K
 */
public class Treeset {
     public static void main(String[] args) 
    {
       TreeSet<Integer> ts=new TreeSet<>(Arrays.asList(11,12,13,14,15));
       ts.add(17);
       ts.add(20);
       ts.add(37);
       ts.add(40);
       ts.add(45);
       ts.add(50);
       ts.add(60);
       System.out.println("\nthe Initial value of TreeSet is :"+ts);
       
      
        ts.remove(15);
        System.out.println("\nAfter removing '15' in TreeSet is :"+ts);
        
        
        TreeSet<Integer> ts1=new TreeSet<>(Arrays.asList(22,33,44,55));
        ts.addAll(ts1);
        System.out.println("\nthe After adding the value of 2nd HashSet to 1st is :"+ts);
        
        ts.pollFirst();
        System.out.println("\nAfter removing 1st element in TreeSet is :"+ts);
        
        ts.pollLast();
        System.out.println("\nAfter removing last element in TreeSet is :"+ts);
         
        System.out.println("\nthe value of TreeSet '41' or give nearest element is:"+ts.ceiling(41));

        System.out.println("\nAfter the TreeSet element is :");
        ts.forEach(n->System.out.print(n+" "));
        
        ts.clear();
        System.out.println("\nAfter Clearing the TreeSet is :"+ts);
       

   }
}
