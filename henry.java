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
public class henry {
    static boolean isPerfect(int num){
        int sum = 0;
        
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum+=i;
            }
        }
        if(sum == num){
            return true;
        }
        return false;
    }
    
    static int henry(int num1, int num2){
        int sum = 0, count = 0, temp1 = 0, temp2 = 0;
        for(int i = 1; ; i++){
            sum+=i;
            if(isPerfect(sum)){
                count++;
                if(count == num1){
                    temp1 = sum;
                }
                if(count == num2){
                    temp2 = sum;
                    break;
                }
            }
        }
        
        return temp1 + temp2;
        
    }
    
    public static void main(String[] args) {
        System.out.println(henry(2, 3));
    }
}
