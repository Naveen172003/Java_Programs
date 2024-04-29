/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thread_priority_in_multithreading;

/**
 *
 * @author Naveen Raj. K
 */
class multi_thread extends Thread{
    public void run(){
        System.out.println("Inside run method");
    }
}
public class Thread_Priority_in_Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        multi_thread mt1=new multi_thread();
        multi_thread mt2=new multi_thread();
        multi_thread mt3=new multi_thread();
        
        System.out.println("mt1 Thread priority : "+mt1.getPriority());
        System.out.println("mt2 Thread priority : "+mt2.getPriority());
        System.out.println("mt3 Thread priority : "+mt3.getPriority());
        System.out.println();
        
        mt1.setPriority(Thread.MIN_PRIORITY);
        mt2.setPriority(Thread.NORM_PRIORITY);
        mt3.setPriority(Thread.MAX_PRIORITY);
        
        System.out.println("mt1 Thread priority : "+mt1.getPriority());
        System.out.println("mt2 Thread priority : "+mt2.getPriority());
        System.out.println("mt3 Thread priority : "+mt3.getPriority());
        System.out.println();
        
        mt1.setPriority(3);
        mt2.setPriority(6);
        mt3.setPriority(9);
        
        System.out.println("mt1 Thread priority : "+mt1.getPriority());
        System.out.println("mt2 Thread priority : "+mt2.getPriority());
        System.out.println("mt3 Thread priority : "+mt3.getPriority());
        System.out.println();
        
        System.out.println("Currently Executing Thread : "+Thread.currentThread().getName());
        System.out.println("Main Thread priority : "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread priority : "+Thread.currentThread().getPriority());
    }
    
}
