/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Generics;

/**
 *
 * @author Naveen Raj. K
 */
class test<T>{
    T object;
    test(T obj){
        this.object=obj;
    }
    
    public T getobject(){
        return this.object;
    }
}

class sol<I,S>{
    I object1;
    S object2;
    sol(I obj1, S obj2){
        this.object1=obj1;
        this.object2=obj2;
    }
    public void print(){
        System.out.println(object1);
        System.out.println(object2);
    }
}
public class Generic_in_object {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        test<Integer> st=new test<Integer>(30);
        System.out.println(st.getobject());
        
        test<String> ts=new test<String>("programming");
        System.out.println(ts.getobject());
        
        System.out.println();
        
        sol<Integer,String> ob=new sol<Integer,String>(100,"java programming");
        ob.print();
    }
    
}
