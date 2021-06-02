package com.company;

public class Main {

    public static void main(String[] args) {

        FirstOne firstOne = new FirstOne();

        firstOne.Number = 6;//Error
        
        int tmp = firstOne.Number;

        System.out.println(tmp);

    }
}
