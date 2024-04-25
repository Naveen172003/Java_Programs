/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package removeduplicates;

import java.util.HashSet;

/**
 *
 * @author Naveen Raj. K
 */
public class remove_duplicate_in_array 
{
    static int[] removeDuplicates(int[] arr) 
    {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        
        int[] rs = new int[hs.size()];
        int j = 0;
        for (int x : hs) {
            rs[j++] = x;
        }
        
        return rs;
    }
  
}
