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
public class Stanton {
    static int statonMeasure(int[] arr){
        int len = arr.length;
        int num_of_ones = 0;
        int count = 0;
        
        for(int i = 0; i < len; i++){
            if(arr[i] == 1)
                num_of_ones++;
        }
        for(int i = 0; i < len; i++){
            if(arr[i] == num_of_ones)
                count++;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(statonMeasure(new int[]{3,1,1,4}));
    }
}
