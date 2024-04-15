/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.util.BitSet;

/**
 *
 * @author Naveen Raj. K
 */
public class Bitset {
    public static void main(String[] args)throws Exception
    {
        BitSet bs1=new BitSet();
        bs1.set(0);
        bs1.set(2);
        bs1.set(4);
        bs1.set(6);
        bs1.set(8);
        System.out.println("The index stored in BitSet :"+bs1);
        System.out.println("The index of (5) stored in BitSet :"+bs1.get(5));
        BitSet bs2=new BitSet();
         bs1.set(0);
        bs1.set(1);
         bs1.set(2);
        bs1.set(3);
         bs1.set(4);
        bs1.set(5);
         bs1.set(6);
        bs1.set(7);
         bs1.set(8);
        System.out.println("The index stored in BitSet :"+bs2);
        bs1.and(bs2);
        System.out.println("The index stored inboth bs1 and bs2 :"+bs1);
        bs1.flip(0,bs1.length());
        System.out.println("The index stored in BitSet:"+bs1);
        
        
        
    }
}
