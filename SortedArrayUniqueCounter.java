/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorted.array.unique.counter;

/**
 *
 * @author Naveen Raj. K
 */
public class SortedArrayUniqueCounter {
    public int countUnique(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i + 1;
    }

    public static void main(String[] args) {
        
        SortedArrayUniqueCounter counter = new SortedArrayUniqueCounter();
        int[] nums = {1, 1, 2};
        int uniqueCount = counter.countUnique(nums);
        System.out.println("Output: " + uniqueCount);
    }
}

