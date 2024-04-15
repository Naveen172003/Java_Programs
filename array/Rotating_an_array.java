
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naveen Raj. K
 */
public class Rotating_an_array {
    /*Left Rotating an array*/
    public static void main(String[] args)
    {
        int i,a,j,num;
        Scanner in=new Scanner(System.in);
        System.out.print("enter no. of array numbers:");
        num=in.nextInt();
        int Arr[]= new int[num];
        System.out.print("enter array numbers:");
        
        for(i=0;i<num;i++)
         {
             Arr[i]=in.nextInt();
         }
        System.out.print("enter no. of times to rotate an array:");
        int n=in.nextInt();
        for(a=0;a<n;a++)
        {
            int temp=Arr[0];
            for(j=1;j<Arr.length;j++)
            {
                Arr[j-1]=Arr[j];
            }
            Arr[Arr.length-1]=temp;
        
        }
        
        for(int k=0;k<Arr.length;k++)
        {
            System.out.print(Arr[k]+" , ");
        }
    }
    /*Right Rotating an array
    public static void main(String[] args)
    {
        int i,a,j,num;
        Scanner in=new Scanner(System.in);
        System.out.print("enter no. of array numbers:");
        num=in.nextInt();
        int Arr[]= new int[num];
        System.out.print("enter array numbers:");
        
        for(i=0;i<num;i++)
         {
             Arr[i]=in.nextInt();
         }
        System.out.print("enter no. of times to rotate an array:");
        int n=in.nextInt();
        for(a=0;a<n;a++)
        {
            int temp=Arr[Arr.length-1];
            for(j=Arr.length-1;j>0;j--)
            {
                Arr[j]=Arr[j-1];
            }
            Arr[0]=temp;
        
        }
        
        for(int k=0;k<Arr.length;k++)
        {
            System.out.print(Arr[k]+" , ");
        }
        
        
    }*/
    
}
