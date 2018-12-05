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
public class PorcupineNum {
    
    static boolean isPrime(int val){
        if(val <= 1)
            return false;
        for(int i = 2; i<val; i++){
            if(val % i == 0)
                return false;
        }
        
        return true;
    }
    
    static int nextPorcupineNumber(int num){
        int digit = 0;
        
        for(int i = num + 1; ; i++){
            if(isPrime(i) && i % 10 == 9){
                for(int j = i + 1; ; j++){
                    if(isPrime(j) && j % 10 == 9){
                        return i;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(nextPorcupineNumber(149));
    }
}
