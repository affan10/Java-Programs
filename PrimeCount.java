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
public class PrimeCount {
    
    static boolean isPrime(int num){
        
        if(num == 1 || num == 0)
            return false;
        
        for(int i = 2; i <  num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    static int primeCount(int start, int end){
        
        int count = 0;
        if(start < 0)
            start = 1;
        
        for(int i = start; i <= end; i++){
            if(isPrime(i))
                count++;
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(primeCount(-10, 6));
    }
}
