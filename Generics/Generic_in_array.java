/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Generics;

/**
 *
 * @author Naveen Raj. K
 */
class array<A>{
    A arr[]=(A[])new Object[8];
    int length=0;
    public void append(A v){
        arr[length++]=v;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
public class Generic_in_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Integer : ");
        array<Integer> arr=new array<>();
        arr.append(10);
        arr.append(20);
        arr.append(30);
        arr.append(40);
        
        arr.display();
        
        System.out.println("String : ");
        array<String> ar=new array<>();
        ar.append("aa");
        ar.append("bb");
        ar.append("cc");
        ar.append("dd");
        
        ar.display();
    }
    
}
