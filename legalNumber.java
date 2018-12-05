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
public class legalNumber {
    static int isLegal(int[] arr, int n){
        int len = arr.length;
        if(len == 0)
            return 0;
        for(int i = 0; i < len; i++){
            if(arr[i] > n)
                return 0;
        }
        return 1;
    }
    
    static int convertToBase10(int[] arr, int n){
            int temp = isLegal(arr, n), sum = 0;
            if(temp == 1){
                for(int i = 0, j = arr.length - 1; i < arr.length; i++, j--){
                    sum+=arr[j]*(Math.pow(n, i));
                }
                return sum;
            }
            return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(convertToBase10(new int[]{}, 0));
    }
}
