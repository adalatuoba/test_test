package com.phz;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        String[] cities = {"北京", "上海", "广州", "深圳"};
        int[] a = {1,21, 34,15, 5, 6, 64 ,7, 8};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,21));
        Arrays.fill(a,2,4,100);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(cities));
        String[] s = new String[6];
        System.arraycopy(cities,1, s, 1, cities.length-1);
        for(int i=0; i<cities.length;i++){
            System.out.println(cities[i]);
        }
        for(String t: s){
            System.out.println(t);
        }
    }
}
