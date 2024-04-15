/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.util.LinkedHashMap;

/**
 *
 * @author Naveen Raj. K
 */
public class Linked_Hashmap {
    public static void main(String[] args) {
        
       LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
       hm.put(1, "AA");
       hm.put(2, "BB");
       hm.put(3, "CC");
       hm.put(4, "DD");
       System.out.println("LinkedHashMap :"+hm);
       System.out.println("get(1) : "+hm.get(1));
       System.out.println("putFirst(0,'aa') : "+hm.putFirst(0,"aa"));
       System.out.println("putLast(5,'ee')) : "+hm.putLast(5,"ee"));
       System.out.println("LinkedHashMap :"+hm);
       System.out.println("reversed : "+hm.reversed());
       System.out.println("contains Value:"+hm.containsValue("CC"));

        System.out.println("After LinkedHashMap :"+hm);
    }
}
