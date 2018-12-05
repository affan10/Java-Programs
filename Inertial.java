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
public class Inertial {
    static int isInertial(int[] arr){
        int len = arr.length;
        int flag = 0;
        if(len == 1)
            return 0;
        
        int max = arr[0];
        for(int i = 0; i<len-1; i++){
            if(arr[i+1] > max)
                max = arr[i+1];
        }
        for(int i = 0; i<len; i++){
            if(arr[i] % 2 != 0){
                flag = 1;
                break;
            }
        }
        
        if(flag == 1){
            if(max % 2 == 0){
                for(int i = 0; i<len; i++){
                    if(arr[i] % 2 != 0){
                        for(int j = 0; j < len; j++){
                            if(arr[j] % 2 == 0 && arr[j] != max){
                                if(arr[i] < arr[j])
                                    return 0;
                            }
                        }
                    }
                }
                return 1;
            }
            else
                return 0;
        }
        else
            return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(isInertial(new int[]{2,4,6,8,10}));
    }
}
