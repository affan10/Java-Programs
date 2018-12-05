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
public class Dups {
    static int f(int[] first, int[] sec)
    {
        int len_f = (int) first.length;
        int len_s = (int) sec.length;
        int flag = 0;
        
        if(len_s != len_f)
        {
            return 0;
        }
        else
        {
            for(int i = 0; i < len_f; i++)
            {
                if(first[i] != sec[i])
                {
                    return 0;
                }
                else
                {
                    flag = 1;
                }
                
            }
            
            if(flag == 1)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
    
    public static void main(String[] args)
    {
        //a3(new char[]{'a', 'b', 'c'}, 0, 4);
        int result = f(new int[]{1,1,1,1}, new int[]{1,1,1,1});
        System.out.println("Result = " + result);
    }
}
