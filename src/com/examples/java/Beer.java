package com.examples.java;

public class Beer {

    public static void main(String[] args){

        System.out.println("hi");

        int ale = 100;
        while ( ale > 0 ){
            System.out.println( ale +" Bottles of beer on the wall. " + ale + " Bottles of beer. You take one down and pass it around.");
            ale--;
            System.out.println(ale + " Bottles of beer");
        }
        System.out.println("the beer is gone");
    }
}
