/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Affan
 */
public class Armstrong {
    static int f(int[] a)
    {
        int len = a.length;
        String number = "";
        for(int i = 0; i < len; i++)
        {
            number = number + Integer.toString(a[i]);
        }
        
        int num_in_int = Integer.parseInt(number);
        int sum = 0;
        for(int i = 0; i < len; i++)
        {
            sum += Math.pow(a[i], len);
        }
        
        if(num_in_int == sum)
        {
            //System.out.println(number +" " + sum);
            return 1;
            
        }
        else
        {
            return 0;
        }
        
        //return 0;
    }
    
    public static void main(String[] args)
    {
        int result = f(new int[]{5,4,7,4,8});
        System.out.println("Result = " + result);
    }
}
