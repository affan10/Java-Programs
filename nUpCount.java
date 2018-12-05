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
public class nUpCount {
    static int nUpCount(int[] arr, int num){
        int len = arr.length;
        int partial = 0;
        int count = 0;
        
        for(int i = 0; i < len; i++){
            partial += arr[i];
            if(partial > num)
                count++;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{1,2,-1,5,3,2,-3}, 20));
    }
}
