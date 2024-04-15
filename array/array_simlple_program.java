/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class array_simlple_program {
    
    /* sum of all elements
    
    public static void main(String[] args) {
        int i,j,sum=0,num;
        Scanner in=new Scanner(System.in);
        System.out.print("enter no. of array numbers:");
        num=in.nextInt();
        int Arr[]= new int[num];
        System.out.print("enter array numbers:");
        
         for(i=0;i<num;i++)
         {
             Arr[i]=in.nextInt();
         }
       
        for( j=0;j<Arr.length;j++)
        {
            sum=sum+Arr[j];
        }
        System.out.print(sum);
    }*/
    
    /*searching an elements in array
    public static void main(String[] args)
    {
        int i,j,key,num;
        Scanner in=new Scanner(System.in);
        System.out.print("enter no. of array numbers:");
        num=in.nextInt();
        int Arr[]= new int[num];
        System.out.print("enter array numbers:");
        
         for(i=0;i<num;i++)
         {
             Arr[i]=in.nextInt();
         }
        System.out.print("enter search element:");
        key=in.nextInt();
        for(j=0;j<Arr.length;j++)
         {
            if(Arr[j]==key)
            {
                System.out.println("search elemente is found:"+Arr[j]);
                System.exit(0);
            }
            
                
         }
        System.out.println("elements not found");
    }*/
    
    /*finding second maximun elements in array*/
    public static void main(String[] args)
    {
        int i,j,num;
        Scanner in=new Scanner(System.in);
        System.out.print("enter no. of array numbers:");
        num=in.nextInt();
        int Arr[]= new int[num];
        System.out.print("enter array numbers:");
        
         for(i=0;i<num;i++)
         {
             Arr[i]=in.nextInt();
         }
        int max1,max2;
        max1=max2=0;
        for(j=0;j<Arr.length;j++)
        {
             if(Arr[j]>max1)
             {
                 max2=max1;
                 max1=Arr[j];
             }
             else if(Arr[j]>max2)
             {
                 max2=Arr[j];
             }   
        }
        System.out.println("first max numbers:"+max1);
        System.out.println("second max numbers:"+max2);
    }
}
