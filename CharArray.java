///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package javaapplication1;

public class CharArray {

    static char[] f(char[] a, int start, int length)
    {
        int len = a.length;
        char[] temp_arr = new char[length];

        if(len == 0 || length < 0 || length > len || start > len || start < 0)
        {
            return null;
        }
        else if(length == 0)
        {
            return temp_arr;
        }
        else
        {
            int counter = 0;
            for(int i = start; i < length; i++)
            {
                temp_arr[counter] = a[i];
                counter++;
            }

            //if()

            //System.out.println(counter);
            for(int i = 0; i < length; i++)
            {
                System.out.print(temp_arr[i] + ",");
            }
            
            return temp_arr;
        }
    }

    public static void main(String[] args) {
   // write your code here
        //char[] temp = new char[3];
        //char[] temp = new char[4];
        //temp = f(new char[]{"1","3","4","5"},0, 3);
//        System.out.println(temp[0]);
//        for(int i = 0; i < temp.length; i++)
//        {
//            System.out.println(temp[i] + ",");
//        }
    }
}

///**
// *
// * @author Affan
// */
//public class CharArray {
//    
//    public static char[] f(char[] arr, int start, int length)
//    {
//        float len = arr.length;
//        int len1 = (int) len;
//        char[] temp = new char[length];
//        int temp_count = 0;
//        if(length > len1 || length < 0 || start < 0 || start > len1)
//        {
//            System.out.println("Blah");
//            return null;
//        }
//        else if(length == 0)
//        {
//            return temp;
//        }
//        else
//        {
//            int count = 0;
//            for(int i = start; i < len1; i++)
//            {
//                count++;
//            }
//            
//            System.out.println("Count = " + count);
//            if(length > count)
//            {
//                System.out.println("Length bigger than array!");
//                return null;
//            }
//            else
//            {
//                if(start == 0)
//                {
//                    for(int i = start; i < length; i++)
//                    {
//                        temp[temp_count] = arr[i];
//                        temp_count++;
//                    }
//                    
//                    return temp;
//                }
//                else
//                {
//                    //int temp_count = 0;
//                    for(int i = start; length > 0; i++, length--)
//                    {
//                        temp[temp_count] = arr[i];
//                        temp_count++;
//                    }
//
//                    return temp;
//                }
//            }
////            System.out.println("Count = " + count);
////            return null;
//        }
//    }
//    
//    public static void main(String[] args)
//    {
//        char input_arr[] = {};
//        int start = 0;
//        int length = 1;
//        char[] temp_arr = new char[length];
//        //temp_arr = f(input_arr, start, length);
//        temp_arr = f(new char[]{'a', 'b', 'c'}, 0, 4);
//        if (temp_arr == null)
//        {
//            System.out.println("null");
//        }
//        else
//        {
//            for (int i = 0; i < temp_arr.length; i++)
//            {
//                System.out.print(temp_arr[i] + ", ");
//            }
//        }
////        int result = f(input_arr, start, length);
////        System.out.println("Result = " + result);
//    }
//}
