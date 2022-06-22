package com;

import java.util.Arrays;
import java.util.Scanner;

public class Mitramas {

    public static void main(String[] args) {
//         Code 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan size : ");
//        Integer size = scanner.nextInt();
//        System.out.println("Hasil : ");
//        int x = 1;
//        int genap = 2;
//        while(x <= size){
//            System.out.print(genap+" ");
//            genap=genap+2;
//            x++;
//        }

//        Code 2
        int x1 = 0, x2 = 1;
        int counter = 0;
        int x3;

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Masukkan size : ");
        Integer count = scanner2.nextInt();
        System.out.println("Fibonacci :");

        while (counter < count) {
            x3 = x2 + x1;
            x1 = x2;
            x2 = x3;
            System.out.print(x1 + " ");
            counter = counter + 1;
        }
    }
}

//Code 3
class Code3 {
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