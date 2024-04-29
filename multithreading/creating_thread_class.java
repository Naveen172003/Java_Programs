/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

/**
 *
 * @author Naveen Raj. K
 */
public class creating_thread_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            multithreading mt=new multithreading();
            mt.start();
        }
         Thread t=new Thread("My Name");
            t.start();
            String str=t.getName();
            System.out.println(str);
    }
    
}
class multithreading extends Thread{
    @Override
    public void run(){
        try{
             System.out.println("Thread "+Thread.currentThread().threadId()+" is running");
        }
        catch(Exception e){
            System.out.println("Exception Caught");
        }
    }
}
