package com.pixelart;

import java.util.Arrays;

public class Main {
    private static int[] array = {2,8,9,3,4,3,2,6,6,2,4,9,8};
    private static String str = "Frog";

    public static void main(String[] args) {
        sortArray();
        getSubstring();
    }

    private static void sortArray()
    {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void getSubstring()
    {
        char temp;
        int tempLength = str.length();
        System.out.println(str + " "+str.length());
        for (int i = 0; i < tempLength-1; i++)
        {

            if( i >0)
            {
                temp = str.charAt(i);
                str = str.replace(""+temp, "");
                System.out.println(str );

                tempLength = str.length();
                i--;
            }


        }


    }
}
