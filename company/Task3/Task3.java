package com.company.Task3;
import java.lang.Math;

public class Task3 {
    public static void main(final String[] args) {
        final int[] intArray = {5, 0, 1, 8, 6, 3, 2, 7, 4};
        final char[] charArray = {'z', 's', 'e', 'v', 'a','q','l'};

        System.out.println(combine( intArray, charArray));
    }

    public static String combine (final int []intArray, final char [] charArray){
        String str = " ";
        final int size = Math.max(intArray.length, charArray.length);
        for(int i = 0; i < size; i++){
            if(i < intArray.length)
                str += intArray[i];
            if( i < charArray.length)
                str += charArray[i];
        }
        return str;
    }
}
