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
public class TwinPaired {
    
    static boolean isOdd(int x){
        if(x % 2 == 0)
            return false;
        else
            return true;
    }
    
    static int isTwinPaired(int[] arr){
        int len = arr.length;
        if(len < 2)
            return 1;
        
        int start = arr[0];    
        if(isOdd(start))
        {
            for(int i = 1; i < len; i++){
                if(isOdd(arr[i])){
                    if(arr[i] >= start){
                        start = arr[i];
                    }
                    else{
                        return 0;
                    }
                }
                else
                    continue;
            }
            int first_even_index = 0;
            for(int i = 1; i < len; i++){
                if(isOdd(arr[i])){
                    first_even_index = i;
                    break;
                }
            }
            
            for(int i = first_even_index + 1; i < len; i++){
                if(!isOdd(arr[i])){
                    if(arr[i] >= first_even_index){
                        first_even_index = arr[i];
                    }
                    else{
                        return 0;
                    }
                }
                else{
                    continue;
                }
            }
            
            return 1;
        }
        else{
            for(int i = 1; i < len; i++){
                if(!isOdd(arr[i])){
                    if(arr[i] >= start){
                        start = arr[i];
                    }
                    else{
                        return 0;
                    }
                }
                else
                    continue;
            }
            int first_odd_index = 0;
            for(int i = 1; i < len; i++){
                if(isOdd(arr[i])){
                    first_odd_index = i;
                    break;
                }
            }
            for(int i = first_odd_index + 1; i < len; i++){
                if(isOdd(arr[i])){
                    if(arr[i] >= arr[first_odd_index]){
                        first_odd_index = i;
                    }
                    else{
                        return 0;
                    }
                }
                else{
                    continue;
                }
            }
            return 1;
        }
            
    }
    
    
    public static void main(String[] args) {
        int result = isTwinPaired(new int[]{-6,2,24,3,5});
        System.out.println(result);
    }
}
