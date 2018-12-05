/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
/**
 *
 * @author Affan
 */
public class recurringChar {
    static char firstRecurringChar(char [] arr){
        if(arr.length < 2)
            return '$';
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j])
                    return arr[i];
            }
        }
        
        return '$';
    }
    
    static char firstRecurringHash(char [] arr){
        HashMap<Character, Integer> entry_table = new HashMap<>();
        int count = 1;
        if(arr.length < 2)
            return '$';
        for(int i = 0; i < arr.length; i++){
            if(entry_table.containsKey(arr[i]))
                return arr[i];
            else
                entry_table.put(arr[i], count);
        }
        return '$';
    }
    
    public static void main(String[] args) {
        long startTimeHash = System.nanoTime();
        //System.out.println(firstRecurringHash(new char[]{'d','a','c','a','f','g'}));
        System.out.println(firstRecurringChar(new char[]{'d','a','c','a','f','g'}));
        long endTimeHash   = System.nanoTime();
        float totalTime = endTimeHash - startTimeHash;
        System.out.println(totalTime/1000000);
    }
}
