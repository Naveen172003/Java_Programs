/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading_functions;

/**
 *
 * @author Naveen Raj. K
 */
public class mythread extends Thread{
    public void run(){
        System.out.println("Thread using Thread class is running");
        int i,n=5;
        for(i=0;i<n;i++){
            System.out.println("Extra functionality in MyThread: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
        }
        
    }
}
