/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io_streams;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 *
 * @author Naveen Raj. K
 */

class producer extends Thread{
    OutputStream os;
    public producer(OutputStream o){
        os=o;
    }
    @Override
    public void run(){
        int count=1;
        while(true){
            try{
                os.write(count);
                os.flush();
                System.out.print("producer : "+count);
                 System.out.flush();
                Thread.sleep(10);
                count++;
            }
            catch(Exception e){
                System.out.print(e);
            }
        }
        
    }
}

class consumer extends Thread{
    InputStream is;
    public consumer(InputStream o){
        is=o;
    }
    @Override
    public void run(){
        int x;
        while(true){
            try{
                x=is.read();
               
                System.out.print("consumer : "+x);
                System.out.flush();
                Thread.sleep(10);
               
            }
            catch(Exception e){
                System.out.print(e);
            }
        }
        
    }
}

public class piped_streams {
    public static void main(String[] args)throws Exception
    {
           PipedInputStream pis=new PipedInputStream();
           PipedOutputStream pos=new PipedOutputStream();
           pos.connect(pis);
           producer p=new producer(pos);
           consumer c=new consumer(pis);
           p.start();
           c.start();
    }
    
}
