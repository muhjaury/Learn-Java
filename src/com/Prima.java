package com;

import com.terminal.Console;

public class Prima {
    public void checkingPrima(int awal, int akhir) {
        Console.log("Daftar bilangan prima yaitu : ");
        for(;awal<=akhir;awal++){
            int checkPrima = 0;
            for(int x=1;x<=awal;x++){
                if(awal%x==0){
                    checkPrima=checkPrima+1;
                }
            }
            if(checkPrima==2){
                System.out.print(awal+" ");
            }
        }
        System.out.println("");

    }

    public void checkingGenap(int awal, int akhir) {
        Console.log("Daftar bilangan genap yaitu : ");
        for(;awal<=akhir;awal++){
            if(awal%2==0){
                System.out.print(awal+" ");
            }
        }
        System.out.println("");

    }
}



