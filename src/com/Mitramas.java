package com;

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
