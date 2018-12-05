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
public class isDivisible {
    static int isDivisble(int[] arr, int divisor){
        int len = arr.length;
        if(len == 0)
            return 1;
        for(int i = 0; i < len; i++){
            if(arr[i] % divisor != 0)
                return 0;
        }
        
        return 1;
    }
    
    public static void main(String[] args) {
        System.out.println(isDivisble(new int[]{}, 12));
    }
}
