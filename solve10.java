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
public class solve10 {
    
    static int factorial(int num){
        if(num == 1)
            return 1;
        int temp = 1;
        for(int i = num; i >= 1; i--){
            temp = temp * i;
        }
        return temp;
    }
    
    static int[] solve10(int[] arr){
        int len = arr.length;
        int[] return_array = new int[2];
        if(len < 3)
            return null;
        
        int ten_fact = factorial(10);
        int first_fact = 0, second_fact = 0;
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len && j != i; j++){
                if((factorial(arr[j]) + factorial(arr[i])) == ten_fact){
                    return_array[0] = arr[i];
                    return_array[1] = arr[j];
                    return return_array;
                }
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
