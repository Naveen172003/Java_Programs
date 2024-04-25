/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package find.missing.value.in.array;

/**
 *
 * @author Naveen Raj. K
 */
public class missing_value {
    static int findmissingvalue(int[] arr){
        int n=arr.length+1;
        int totalsum=n*(n+1)/2;
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        int rs=totalsum-sum;
        
        if(rs<=0){
            rs=n+1;
        }
        System.out.println("Expected sum: "+totalsum);
        System.out.println("Actual sum: "+sum);
        return rs;
    }
}
