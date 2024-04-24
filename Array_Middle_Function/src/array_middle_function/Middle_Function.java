/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array_middle_function;

/**
 *
 * @author Naveen Raj. K
 */
class Middle_Function {
    public static int[] middle(int[] array){
        if(array.length<=2){
            return array;
        }
        int[] mid=new int[array.length-2];
        for(int i=1;i<array.length-1;i++){
            mid[i-1]=array[i];
        }
        return mid;
    }
}
