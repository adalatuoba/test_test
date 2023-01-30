package com.phz;


public class TestCopy {
    public static void main(String[] args) {
        String[] cities = {"北京", "上海", "广州", "深圳"};
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
