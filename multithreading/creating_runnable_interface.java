/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

/**
 *
 * @author Naveen Raj. K
 */
public class creating_runnable_interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        multithreading t=new multithreading();
        Thread obj=new Thread(t,"My new thread");
        obj.start();
        String str=obj.getName();
        System.out.println(str);
    }
    
}
class multithreading implements Runnable{
    @Override
    public void run(){
        try{
            int n=4;
            for(int i=0;i<n;i++)
            {
                System.out.println("Thread "+Thread.currentThread().threadId()+" is running");
            }
        }
        catch(Exception e){
            System.out.println("Exception Caught");
        }
    }
}