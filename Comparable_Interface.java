/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.frameworks.in.java;

import java.util.TreeSet;

class Point implements Comparable
{
    int x,y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return"X="+x+" Y="+y;
    }
    @Override
    public int compareTo(Object o){
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
            if(this.y<p.y)
                return -1;
            
            else if(this.y>p.y)
                return 1;
            else
                return 0;
           
        
    }
}
/**
 *
 * @author Naveen Raj. K
 */
public class Comparable_Interface {
    public static void main(String[] args) {
        
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1, 1));
        ts.add(new Point(5, 5));
        ts.add(new Point(5, 2));
        System.out.println(ts);
    }
}
