/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package single_dimentional_array;

/**
 *
 * @author Naveen Raj. K
 */

class SingleDimentionalArray
{
    int arr[]=null;

    public SingleDimentionalArray(int sizeofarray){
        arr=new int[sizeofarray];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        }

    }
    public void insert(int location,int valuetobeinserted){
        try
        {
            if(arr[location]==Integer.MIN_VALUE){
                arr[location]=valuetobeinserted;
                System.out.println("Successfully inserted in array ");
            }
            else{
                System.out.println("Invalid index to access array ");

            }

        }
        catch(Exception e){
            System.out.print(e);
        }

    }
   public void traversalarray()
    {
        try{
            System.out.print("[");
            for(int i=0;i<arr.length;i++){
                 System.out.print(arr[i]+" ");
            }
            System.out.print("]");
        }
        catch (Exception e) {
        System.out.print("Arrays no longer exists");
        }


    }
   public void searchelements(int key){
       for(int i=0;i<arr.length;i++)
       {
           if(key==arr[i])
           {
               System.out.println("Value is found at index is"+i);
               return;
           }
           
               
       }
       System.out.println(key+" Value is not found");
   }
   public void deletevalue(int valuetobedelete){
       try{
           arr[valuetobedelete]=Integer.MIN_VALUE;
            System.out.print("Delete Successfully ");
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
           System.out.print(e);
           
       }
       
   }
}
public class Single_dimentional_array 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      
            
        SingleDimentionalArray sda=new SingleDimentionalArray(10);
        sda.insert(0, 44);
        sda.insert(1, 10);
        sda.insert(2, 20);
        sda.insert(1, 30);
        sda.insert(5, 50);
        sda.insert(6, 0);
        sda.insert(7, 60);
        sda.insert(8, 80);
        var first=sda.arr[2];
        System.out.println(first);
        
        var second=sda.arr[7];
        System.out.println(second);
        
        System.out.println("Array traversal");
        sda.traversalarray();
        System.out.print("\n");
        
        System.out.println("Search Elements");
        sda.searchelements(60);
        sda.searchelements(50);
        System.out.print("\n");
        
        System.out.println("Delete Elements in 0th place");
        sda.deletevalue(0);
        System.out.print("\n");
        System.out.println("Elements stored in the 0th place 'Integer.MIN_VALUE' ");
        System.out.println(sda.arr[0]);
        System.out.print("\n");

    }
}
