/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permutation;

import java.util.HashMap;

/**
 *
 * @author Naveen Raj. K
 */
public class Solution {
    public boolean permutation(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            hm.put(array1[i], i);
        }

        for (int i = 0; i < array2.length; i++) {
            if (!hm.containsKey(array2[i])) {
                return false;
            }
        }

        return true;
    }
}
