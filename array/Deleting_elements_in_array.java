/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Deleting_elements_in_array {
    //deleting an elements in array
    public static void main(String[] args)
    {
        int i, num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of array numbers: ");
        num = in.nextInt();
        int Arr[] = new int[num];
        System.out.print("Enter array numbers: ");
        for (i = 0; i < num; i++) {
            Arr[i] = in.nextInt();
        }
        

        System.out.print("Enter the position to delete the number: ");
        int pos = in.nextInt();
        
        
         int[] newArr = new int[Arr.length - 1];
         for (int  a= 0; a < num; a++) {
            if (a<pos) {
                newArr[a]=Arr[a];   //coping all elements before pos 
            }
            else
            {
                newArr[a-1]=Arr[a]; //coping rest of elements index 1 less than the original array 
            }
        }
        
        

        System.out.print("Array after insertion: "+Arrays.toString(newArr));
        
    }
}

/*ArrayList<Integer> H = new ArrayList<>();
        // copy all the elements from A to H
        for(int i:A) {
            H.add(i);
        }
        // remove the element from index p
        H.remove(p);
        // convert ArrayList back into Array
        int[] I = H.stream().mapToInt(i->i).toArray();
        // Print the Array
        System.out.print("Final Array : " + Arrays.toString(I));*/