/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package the.sum.of.diagonal.elements.in.pkg2d;

/**
 *
 * @author Naveen Raj. K
 */
public class Exercise {
      public static int sumDiagonalElements(int[][] array) {
          int sum=0;
          for(int i=0;i<array.length;i++){
              sum+=array[i][i];
          }
          return sum;
 
    }
}
