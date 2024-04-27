/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package max_product_of_two_integers;

/**
 *
 * @author Naveen Raj. K
 */
public class Max_Product {
    public String Product(int[] intArray) {
        int maxProduct = Integer.MIN_VALUE;
        String pairs = "";

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] * intArray[j] > maxProduct) {
                    maxProduct = intArray[i] * intArray[j];
                    pairs = Integer.toString(intArray[i]) + "," + Integer.toString(intArray[j]);
                }
            }
        }

        return pairs;
    }
}
