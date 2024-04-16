/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.util.PriorityQueue;

/**
 *
 * @author Naveen Raj. K
 */
public class Priority_Queue {
    public static void main(String[] args) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);

        System.out.println("\nthe value of PriorityQueue 'pq' is :");
        
       for(Integer x:pq){
            System.out.print(x+" ");
       }
      System.out.println("\nPriorityQueue first element :"+ pq.peek());
      System.out.println( "PriorityQueue head element :"+pq.poll());
      System.out.println( "PriorityQueue Next head element :"+pq.poll());
    
        System.out.println("\nAfter value of PriorityQueue element is :");
        pq.forEach(n->System.out.print(n+" "));

   }
}
