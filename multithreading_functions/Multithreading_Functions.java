/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading_functions;

/**
 *
 * @author Naveen Raj. K
 */

public class Multithreading_Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mythread t1=new mythread();
        t1.start();
        
        Thread t2=new Thread(new myrunnable());
        t2.start();
        
        //sleep
        try{
            System.out.println("Sleeping for 2 Seconds ");
            Thread.sleep(2000);
            System.out.println("Awake after sleeping");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        
        //join with timeout
        try{
            System.out.println("Starting join with timeout");
            t1.join(2000);
            System.out.println("Join with timeout completed");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        
        // wait with timeout
        Object lock=new Object();
        synchronized(lock){
        try{
            System.out.println("Waiting with timeout");
            lock.wait(2000);
            System.out.println("Wait with timeout completed");
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
        
    }
    
}

