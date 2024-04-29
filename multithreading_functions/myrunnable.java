/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading_functions;

/**
 *
 * @author Naveen Raj. K
 */
public class myrunnable implements Runnable{
     public void run(){
        
        System.out.println("Thread using Runnable interface is running");
        int n=5;
        for(int i=0;i<n;i++){
            System.out.println("Extra functionality in MyRunnable: " + i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
