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
public class isNUnique {
    static int isNUnique(int[] arr, int num){
        int len = arr.length;
        int k = -1, l = -1, count = 0;
        if(len < 2)
            return 0;
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(isNUnique(new int[]{2,3,3,7}, 5));
    }
}
