/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package search_string_using_linearsearch;

import java.util.*;

/**
 *
 * @author Naveen Raj. K
 */
public class Search_String_using_LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        
        System.out.print("Enter the value to search : ");
        char target = sc.next().charAt(0);
        
        System.out.println(Arrays.toString(str.toCharArray()));
        
        int result=linearsearch(str,target);
        if (result != -1) {
            System.out.print("The value is found at the index of position : " + result);
        } else {
            System.out.print("The value is not found in the String.");
        }
        System.out.println();
        
    }
    static int linearsearch(String str, char target){
        if(str.length()==0){
            return -1;
        }
        for(int index=0;index<str.length();index++){
            
            if(target==str.charAt(index)){
                return index;
            }
        }
        return -1;
    }
}

    

