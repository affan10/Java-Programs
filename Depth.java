/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Affan
 */
public class Depth {
    static int computeDepth(int num){
        int[] arr = new int[10];
        int count = 0, count2 = 0, temp = 0, temp2;
        for(int i = 1; ; i++){
            temp = num * i;
            count2++;
            while(temp > 0){
                temp2 = temp % 10;
                if(temp2 == 0){
                    if(arr[temp2] != temp2){
                        arr[temp2] = temp;
                        break;
                    }
                }
                else{
                    temp = temp /10;
                    if(arr[temp2] != temp2){
                        arr[temp2] = temp;
                        count++;
                        if(count == 10){
                            return count2;
                        }
                    }
                }
//                for(int j = 0; j < 10; j++){
//                    if(arr[j] != temp2){
//                        arr[temp2] = temp2;
//                        count++;
//                        if(count == 10){
//                            return count2;
//                        }
//                    }
//                }
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println(computeDepth(42));
    }
}
