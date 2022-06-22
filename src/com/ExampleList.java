package com;
import java.util.*;

public class ExampleList {

    public List<Integer> list(int x){
        List<Integer> list = new ArrayList<>();
        for(int y=1;y<=x;y++){
            list.add(y);
        }
        return list;
    }
    public ArrayList<Integer> arraylist(int x){
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int y=1;y<=x;y++) {
            arrlist.add(y);
        }
        return arrlist;
    }

    
}

