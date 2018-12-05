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
public class repsEqual {
    static int repsEqual(int[] arr, int val){
        int len = arr.length;
        int temp;
        
        for(int i = len-1; i >= 0; i--){
            temp = val % 10;
            if(arr[i] == temp)
            {
                val = val / 10;
            }
            else{
                return 0;
            }
        }
        
        return 1;
    }
    
    public static void main(String[] args) {
        System.out.println(repsEqual(new int[]{0,0,3,2,0,5,3}, 32053));
    }
}
