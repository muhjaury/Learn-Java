package com;

import java.util.*;
import static java.util.Objects.isNull;

public class Main {

    static void reverse(Integer x[]){
        int y=x.length;
        int xReverse = y-1;
        Integer result[] = new Integer[y];
        for(int b=0;b<y;b++){
            result[b]= x[xReverse];
            xReverse--;
        }
        System.out.println(Arrays.asList(result));
    }

    //With Collection.reverse Method
//    static void reverse(Integer x[]){
//        Collections.reverse(Arrays.asList(x));
//        System.out.println(Arrays.asList(x));
//    }

    //Sort Descending
    static void sortDsc(Integer arrDsc[]) {
        int lengthA = arrDsc.length;
        Integer result[] = new Integer[lengthA];
        int temp = 0;

        //Descending Iterative Way
        for(int x = 0;x<lengthA;x++){
            for(int y =0;y<lengthA;y++){
                if(isNull(result[x])){
                    result[x]=0;
                }
                if(arrDsc[y]>result[x]){
                    result[x]=arrDsc[y];
                    temp=y;
                }
            }
            arrDsc[temp]=0;
        }
        System.out.println(Arrays.asList(result));

        //Sort Descending with Reverse Order
//        Integer sortMethod[] = new Integer[lengthA];
//        Arrays.sort(arrDsc,Collections.reverseOrder());
//        System.out.println(Arrays.asList(arrDsc));

    }

    //Sort Ascending
    static void sortAsc(Integer x33[]) {
        int lengthA = x33.length;
        Integer result[] = new Integer[lengthA];
        int temp=0;

        //Find max value in array
        int max = 0;
        for(int i = 0;i<lengthA;i++){
            if(x33[i]>max){
                max=result[i];
            }
        }

        //Ascending
        for(int x = 0;x<lengthA;x++){
            for(int y =0;y<lengthA;y++){
                if(isNull(result[x])){
                    result[x]=max;
                }
                if(result[y]<result[x]){
                    result[x]=result[y];
                    temp=y;
                }
            }
            result[temp]=max;
        }
        System.out.println(Arrays.asList(result));

//        Integer sortMethod[] = new Integer[lengthA];
//        Arrays.sort(result);
//        System.out.println(Arrays.asList(result));
    }

    //Switch Case
    static void switchCase(){
        Integer nilai = 60;
        switch(nilai){
            case(70):
                System.out.println("Anda lolos");
                break;
            case(60):
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Nilai tidak diketahui");

        }
    }

    public static void main(String[] args) {
        Integer [] a = {1,2,5,4,3};
        System.out.println(Arrays.asList(a));
        Integer b[] = a.clone();
        //Use Reverse Function
        reverse(a);
        //Use Sort Descending Function
        sortDsc(a);
        //Use Sort Ascending Function
        sortAsc(b);
        //Use Switch Case Funcion
        switchCase();
        //Angka Prima
        int awal=1;
        int akhir=10;
        Prima tes = new Prima();
        tes.checkingPrima(awal,akhir);
        tes.checkingGenap(awal,akhir);
        System.out.println("");
        System.out.println("");

        //Use ExampleList Class
        ExampleList l = new ExampleList();
        int ll = 5;
        List<Integer> l1 = l.list(ll);
        l1.set(2,20);
        System.out.print(l1);

        System.out.println("");
        ArrayList<Integer> l2 = l.arraylist(ll);
        for(int a1=0;a1<ll;a1++){
            System.out.print(l2.get(a1)+" ");
        }

        System.out.println("");
        System.out.println("");

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String name = scan.nextLine();
        System.out.print("Masukkan umur : ");
        String age = scan.nextLine();
        InputOutput io = new InputOutput();
        io.setName(name);
        io.setAge(age);
        System.out.println(io.getName());
        System.out.println(io.getAge());
    }
}