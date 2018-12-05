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
public class Guthrie {
    static int isGuthrieSequence(int[] arr){
        int len = arr.length;
        if(len < 2 || arr[len-1] != 1)
            return 0;
        
        int start = arr[0];
        for(int i = 1; i < len; i++){
            if(start % 2 == 0){
                start = start/2;
                if(arr[i] != start){
                    return 0;
                }
                if(i == len-1){
                    if(start != arr[len-1]){
                        return 0;
                    }
                }
            }
            else{
                start = (start*3) + 1;
                if(arr[i] != start){
                    return 0;
                }
                if(i == len-1){
                    if(start != arr[len-1]){
                        return 0;
                    }
                }
            }
        }
        
        return 1;   
        }
    
    static int guthrieIndex(int num){
        int iterations = 0;
        
        if(num == 1)
            return 0;
        while(num != 1){
            if(num % 2 == 0){
                num = num/2;
                iterations++;
            }
            else{
                num = (num*3) + 1;
                iterations++;
            }
        }
        
        return iterations;
    }
    
    public static void main(String[] args) {
        //System.out.println(isGuthrieSequence(new int[]{7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1}));
        System.out.println(guthrieIndex(7));
    }
}
