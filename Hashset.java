/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author Naveen Raj. K
 */
public class Hashset {
    public static void main(String[] args) 
    {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
       hs.add(12);
       hs.add(27);
       hs.add(31);
       hs.add(45);
       hs.add(58);
       hs.add(69);
       System.out.println("\nthe Initial value of HashSet is :"+hs);
       
        hs.remove(10);
        System.out.println("\nAfter removing '10' in HashSet is :"+hs);
        System.out.println("\nthe value of HashSet is containing 31 or not :"+hs.contains(31));
        System.out.println("\nthe value of HashSet is containing 71 or not :"+hs.contains(71));
        
        ArrayList<Integer> list=new ArrayList<>(hs);
        Collections.sort(list);

        System.out.println("\nAfter Sorting the HashSet element is :");
        list.forEach(n->System.out.print(n+" "));

   }
}
