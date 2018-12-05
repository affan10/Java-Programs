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
public class SquarePair {
    
    static boolean isSquare(int num){
        if(num == 0 || num == 1)
            return true;
        for(int i = 1; i < num; i++){
            if(i*i == num)
                return true;
        }
        return false;
    }
    
    static int countSquarePairs(int[] arr){
        int len = arr.length;
        int num_of_pairs = 0;
        if(len < 2)
            return 0;
        
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(i == j)
                    continue;
                if(arr[i] < arr[j] && arr[i] > 0 && arr[j] > 0){
                    if (isSquare(arr[i] + arr[j])){
                        num_of_pairs++;
                    }
                }
            }
        }
        return num_of_pairs;
    }
    
    public static void main(String[] args) {
         System.out.println(countSquarePairs(new int[]{2,7,10,6,18}));
    }
}
