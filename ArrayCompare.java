/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Affan
 */
public class ArrayCompare {
    
    public static int[] f(int[] first, int[] second)
    {
        if(first == null || second == null)
        {
            return null;
        }
        else if(first.length == 0 || second.length == 0)
        {
            int[] temp_arr = new int[0];
            return temp_arr;
        }
        else
        {
            float len1 = first.length;
            float len2 = second.length;
            int len_first = (int) len1;
            int len_sec = (int) len2;
            ArrayList<Integer> output = new ArrayList<Integer>();
            int[] temp_arr;
            int count = 0;

//            if(len_first < len_sec)
//            {
//                temp_arr = new int[len_first];
//            }
//            else
//            {
//                temp_arr = new int[len_sec];
//            }


            for(int i = 0; i< len_first; i++)
            {
                for(int j = 0; j < len_sec; j++)
                {
                    if(first[i] == second[j])
                    {
                        output.add(first[i]);
                    }
                }
            }
            
            temp_arr = new int[output.size()];
            for(int i = 0; i < output.size(); i++)
            {
                temp_arr[i] = output.get(i);
            }
            return temp_arr;
        }
    }
    
    public static void main(String[] args)
    {
        int[] first_arr = {1, 3, 5,6,7,8,10,11,12,13,14,15,16,18,20,22,465};
        int[] sec_arr = {1,4,6,7,465,9,10,11,15,15};
        int[] temp_arr;
        
        temp_arr = f(first_arr, sec_arr);
        if(temp_arr == null)
        {
            System.out.println("null");
        }
        else
        {
            System.out.println(Arrays.toString(temp_arr));
//            for (int i = 0; i < temp_arr.length; i++)
//            {
//                System.out.print(temp_arr[i] + ", ");
//            }
        }
    }
}
