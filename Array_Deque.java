/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 *
 * @author Naveen Raj. K
 */
public class Array_Deque {
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerLast(50);
        dq.forEach(n->System.out.print(n+" "));
        
        
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(4);
        dq.offerFirst(7);
        dq.offerFirst(5);
        
        System.out.println("\nthe value of ArrayDeque 'dq' is :");
        
       for(Integer x:dq){
            System.out.print(x+" ");
       }
      System.out.println();
      
      
       //dq.forEach(n->System.out.print(n+" "));
       
       ArrayDeque<Integer> dq1=new ArrayDeque<>(Arrays.asList(11,22,33,44,55));
       
       dq1.add(66);
       dq1.addAll(dq);
       
         System.out.println("\nthe value of ArrayDeque 'dq1' is :");
        dq1.forEach(n->System.out.print(n+" "));
        
       System.out.println("\ngetFirst "+dq1.getFirst()); 
        System.out.println("peekLast "+dq1.peekLast());
        System.out.println("pollFirst "+dq1.pollFirst());
        
        System.out.println("\nAfter value of ArrayDeque 'dq1' is :");
        dq1.forEach(n->System.out.print(n+" "));

   }
}
