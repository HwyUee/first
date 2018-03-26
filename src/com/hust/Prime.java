package com.hust;

import java.util.ArrayList;

/**
 * Created by HwyUee on 2018/3/26.
 */
public class Prime {
    public static void result(int a,int b){
        int j=0;
        ArrayList al =new ArrayList();
        for (int i = a; i <b+1; i++) {
            for (j = 2; j <i ; j++) {
                if (i%j==0) break;
            }
            if (j==i){
                al.add(i);
            }
        }
        System.out.println(a+"至"+b+"之间的素数为：");
        for (int i = 0; i <al.size() ; i++) {
            System.out.println(al.get(i));
        }

    }

    public static void main(String[] args) {
        Prime.result(101,200);
    }
}
