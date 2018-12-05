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
public class centered15 {
    static int isCentered15(int[] arr){
        int len = arr.length;
        if(len == 0)
            return 0;
        
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum = 0;
            for(int j = i; j < len; j++){    
                sum+=arr[j];
                if(sum > 15){
                    break;
                }
                if(sum == 15){
                    int count1 = 0, count2 = 0;
                    for(int k = i-1; k >= 0; k--){
                        count1++;
                    }
                    for(int k = j + 1; k < len; k++){
                        count2++;
                    }
                    
                    if(count1 == count2)
                        return 1;
                    break;
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(isCentered15(new int[]{1,1,15,-1,-1}));
    }
}
