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
public class PerfectSquare {
    static int nextPerfectSquare(int n){
        for(int i = 0; i <= n; i++){
            if(n == 0)
                return 1;
            else if(n < 0)
                return 0;
            else if(i*i > n)
                return i*i;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(nextPerfectSquare(64));
    }
}
