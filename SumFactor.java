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
public class SumFactor {
    static int sumFactor(int[] arr){
        int len = arr.length;
        int sum = 0;
        int count = 0;
        
        if(len == 0)
            return 0;
        for(int i = 0; i<len; i++){
            sum += arr[i];
        }
        for(int i = 0; i<len; i++){
            if(arr[i] == sum)
                count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(sumFactor(new int[]{0,0,0}));
    }
}
