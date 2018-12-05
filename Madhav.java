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
public class Madhav {
    static int isMadhavArray(int[] arr){
        int len = arr.length;
        boolean flag = false;
        int count = 0;
        
        for(int i = 0; i <= len; i++){
            if(len == 0){
                return 1;
            }
            if((i * (i + 1))/2 == len){
                flag = true;
            }
        }
        
       int start = 1;
       int end = 3;
       return 1;
    }
    
    public static void main(String[] args) {
        System.out.println(isMadhavArray(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));
    }
}
