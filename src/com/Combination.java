package com;

import java.util.Arrays;
import java.util.Scanner;

public class Combination {
    public static int[] combineSort(int arr1[], int arr2[]){
        int lengthA = arr1.length;
        int lengthB = arr2.length;
        int lengthResult = lengthA+lengthB;
        int[] result = new int[lengthResult];

        System.arraycopy(arr1, 0, result, 0, lengthA);
        System.arraycopy(arr2, 0, result, lengthA, lengthB);

        int temp;
        for (int i = 1; i < result.length; i++) {
            for (int j = i; j > 0; j--) {
                if (result[j] < result [j - 1]) {
                    temp = result[j];
                    result[j] = result[j - 1];
                    result[j - 1] = temp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan Jumlah Element Array 1: ");
        int n=sc.nextInt();
        int[] x = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Masukkan Array index ke " + i + " : ");
            x[i]=sc.nextInt();
        }

        System.out.print("Masukkan Jumlah Element Array 2: ");
        int n2=sc.nextInt();
        int[] y = new int[n2];
        for(int i=0; i<n2; i++)
        {
            System.out.println("Masukkan Array index ke " + i + " : ");
            y[i]=sc.nextInt();
        }

        int[] result = combineSort(x,y);
        System.out.println(Arrays.toString(result));
        System.out.println(result.length);

    }
}
