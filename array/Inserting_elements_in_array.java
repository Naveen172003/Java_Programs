/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class Inserting_elements_in_array {
    public static void main(String[] args)
    {
        int i, num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of array numbers: ");
        num = in.nextInt();
        int Arr[] = new int[num+1];
        System.out.print("Enter array numbers: ");
        for (i = 0; i < num; i++) {
            Arr[i] = in.nextInt();
        }

        System.out.print("Enter the number to insert into the array: ");
        int x = in.nextInt();
        System.out.print("Enter the position to insert the number: ");
        int pos = in.nextInt();
        for(int j=num-1;j>=pos-1;j--)
        {
            Arr[j+1]=Arr[j];
        }
        Arr[pos-1]=x;

        System.out.print("Array after insertion: ");
        for (int k = 0; k < Arr.length; k++) {
            System.out.print(Arr[k] + " ");
        }
    }
}

/* Creating a new ArrayList with Integer Wrapper Class
        ArrayList<Integer> F = new ArrayList<>();
        //copy all the elements from A to F
        for(int i:A) {
            F.add(i);
        }
        //add the element x at p
        F.add(p, x);
        //Convert the ArrayList back into Array        
        int[] G = F.stream().mapToInt(i->i).toArray();
        //Print the array
        System.out.print("Final Array : " + Arrays.toString(G));*/