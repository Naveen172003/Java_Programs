/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kth_max_and_min_element_of_an_array;

import java.util.PriorityQueue;

/**
 *
 * @author Naveen Raj. K
 */
public class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = l; i <= r; i++) {
            pq.offer(arr[i]);
        }

        for (int i = 0; i < k - 1; i++) {
            pq.remove();
        }

        return pq.peek();
    }
}
