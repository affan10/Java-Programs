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
public class Stacked {
    static int isStacked(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum+=i;
            if(sum == num)
                return 1;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(isStacked(9));
    }
}
