package com.pixelart;

import java.util.Arrays;

public class Main {
    private static int[] array = {2,8,9,3,4,3,2,6,6,2,4,9,8};

    public static void main(String[] args) {
        sortArray();
    }

    private static void sortArray()
    {
        Arrays.sort(array);
        System.out.println(""+ Arrays.toString(array));
    }
}
