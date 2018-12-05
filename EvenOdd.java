/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Affan
 */
public class EvenOdd {
    
    public static int f(int a[])
    {
        int len = a.length;
        if(len == 0)
        {
            return 0;
        }
//        else if(len == 1)
//        {
//            return -a[0];
//        }
        else
        {
            int X = 0, Y = 0;
            for(int i = 0; i < len; i++)
            {
                if(a[i] % 2 == 0)
                {
                    Y += a[i];
                }
                else
                {
                    X += a[i];
                }
            }
            
            return X-Y;
        }
    }
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        String temp = reader.nextLine();
        System.out.println(temp);
        int result = f(new int[]{1,1});
        System.out.println("Result = " + result);
    }
}
