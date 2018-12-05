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
public class PrimeH {
    
    static boolean isPrime(int val){
        
        if(val == 0){
            return false;
        }
        else{
            for(int i = 2; i < val; i++){
                if(val % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    
    static int isPrimeHappy(int num){
        
        int sum = 0;
        if(num <= 2){
            return 0;
        }
        else
        {
            for(int i = 2; i < num; i++){
                if(isPrime(i)){
                    sum += i;
                }
                
            }
            
            if(sum % num == 0){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    
    public static void main(String[] args) {
        int temp = isPrimeHappy(2);
        System.out.println(temp);
    }
}
//    static boolean isPrime(int num){
//        for(int i = 2; i < num; i++){
//            
//        }
//    }}