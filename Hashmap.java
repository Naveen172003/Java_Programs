/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.util.HashMap;

/**
 *
 * @author Naveen Raj. K
 */
public class Hashmap {
     public static void main(String[] args) 
    {
       HashMap<String,Integer> hm=new HashMap<>();
       hm.put("AAA", 10);
        hm.put("BBB", 20);
        hm.put("CCC", 30);
        
        hm.put("DDD", 40);
        hm.put("EEE", 50);
        hm.put("FFF", 60);

       System.out.println("\nthe Initial value of HashMap is :"+hm);
       
        System.out.println("\nThe value for BBB is :"+hm.get("BBB"));
        hm.remove("CCC");
        System.out.println("\nThe value of after removing 'CCC' is :"+hm);
        
        System.out.println("\nThe  HashMap contain DDD or not is :"+hm.containsKey("DDD"));
        System.out.println("\nThe  values of HashMap is :"+hm.values());
        
        System.out.println("\nThe value of HashMap is :"+hm);


   }
}
