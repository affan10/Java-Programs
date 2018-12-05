/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

//import java.util.Collections;
//import java.util.Scanner;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Affan
 */
public class CenteredArray {

    /**
     * @param args the command line arguments
     */
    
    public static int f(int arr[])
    {
        float len = arr.length;
        len = (int) len;
        int flag = 0, flag2 = 0;
        //System.out.println(len);
        if (len == 0)
        {
            //System.out.println("No middle elem!");
            return 0;
        }
        else if (len % 2 == 0)
        {
            //System.out.println("No middle elem!");
            return 0;
        }
        else if(len == 1)
        {
            //System.out.println("Centered Array!");
            return 1;
        }
        else
        {
            double middle = Math.floor(len/2);
            //System.out.println("Mid: " + middle);
            int mid_int = (int) middle;
            int mid_val = arr[mid_int];
//            System.out.println("Mid Int: " + mid_int);
//            System.out.println("Mid Val: " + mid_val);
            
            for(int i = 0; i < mid_int; i++)
            {
                
                if(arr[i] < mid_val)
                {
                    //flag = 1;
                    //System.out.println("Not Centered!");
                    return 0;
                }
                else if(arr[i] == mid_val)
                {
                    //System.out.println("Not Centered!");
                    return 0;
                }
                else
                {
                    //System.out.println(arr[i]);
                    flag = 1;
                }
            }
            
            if(flag == 1)
            {
                for(int i = mid_int + 1; i < (int) len; i++)
                {
                    if(arr[i] < mid_val)
                    {
                        //System.out.println("Not Centered!");
                        return 0;
                    }
                    else if(arr[i] == mid_val)
                    {
                        //System.out.println("Not Centered!");
                        return 0;
                    }
                    else
                    {
                        //System.out.println(arr[i]);
                        flag2 = 1;
                    }
                }
            
                if(flag2 == 1)
                {
                    //System.out.println("Centered Array!");
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
            else
            {
                return 0;
            }
        }   
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //int int_arr[] = new int[5];
        int int_arr[] =  new int[]{3,2,1,4,5};
        int temp = f(int_arr);
        System.out.println("Temp = " + temp);
    }
}