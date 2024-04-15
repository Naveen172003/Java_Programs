/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Naveen Raj. K
 */
public class Arrays_and_Comparator {
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args)throws Exception
    {
       int a[]={1,2,3,4,5,6,7,8};
       int b[]={1,2,3,4,5,6,7,8};
       System.out.println("compare a to b :"+Arrays.compare(a,b));
       
       System.out.println("\n");
       
       
        int c[]=Arrays.copyOf(a,a.length);
        Arrays.sort(c);
        System.out.println("the sort array :");
        Arrays.stream(c).forEach(n->System.out.print(n+" "));
        
        System.out.println("\n");
        
        System.out.println("binary Search index (7) holds the value in arrays: "+Arrays.binarySearch(c,7));
        
        
        System.out.println("\n");
        
        
         Integer n[]={10,20,50,40,30,60,80,90,70};
         Arrays.sort(n,new my());
         
         System.out.println("The new array(Integer n[]) and comparator to show the reversed array :");
         for(Integer x:n){
             System.out.print(x+" ");
         }
         System.out.println("");
    }
    
}
class my implements Comparator<Integer>
{
    @Override
    public int compare(Integer i1,Integer i2){
        if(i1<i2)
            return 1;
        else if(i1>i2)
            return -1;
        else
            return 0;
    }
    
}

