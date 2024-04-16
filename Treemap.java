/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Naveen Raj. K
 */
public class Treemap {
    public static void main(String[] args) {
        
        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(1,"AAA",2,"BBB",3,"CCC"));
        tm.put(4,"DDD");
        tm.put(5, "EEE");
        tm.put(6, "FFF");
        tm.put(7, "GGG");
        System.out.println("Treemap :"+tm);
        System.out.println("ceiling Entry(3) :"+tm.ceilingEntry(3).getValue());
        System.out.println("replace old value to new value in index:"+tm.replace(3, "CCC", "NNN"));
        System.out.println("lastEntry"+tm.lastEntry());
        System.out.println(tm);
        System.out.println("firstEntry"+tm.firstEntry());
        System.out.println(tm);
        System.out.println("pollFirstEntry"+tm.pollFirstEntry());
        System.out.println(tm);
        System.out.println("remove index '6' :"+tm.remove(6));

        System.out.print("After Treemap :"+tm);
    }
}
