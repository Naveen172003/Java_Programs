/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculate_avg_temperature;

import java.util.Scanner;

/**
 *
 * @author Naveen Raj. K
 */
public class calculate_avg_temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many day's temperature ? ");
        int days=sc.nextInt();
        int arr[]=new int[days];
        int sum=0;
        for(int i=0;i<days;i++)
        {
            System.out.println("Days "+(i+1)+"'s high temp:");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        
        }
        double avg=sum/days;
        
        int above=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>avg){
                above++;
            }
        }
        System.out.println();
        System.out.println("Average temp ="+avg);
        System.out.println(above+" day's above average ");
    }
    
}
