package org.example.LoopsAndLists;

import java.util.ArrayList;
import java.util.List;

public class Store {

    public static List<Integer> evenNumberList = new ArrayList<>();


    // STORING ALL EVEN NUMBERS INSIDE A LIST
    public static void printEvenNumbers(int number){
        for(int i=0 ; i<number; i++){
            if(i % 2 ==0){
                evenNumberList.add(i);
            }
        }

    }

// METHOD THAT CHECKS IF A NUMBER IS A PRIME NUMBER
    public static void primeNumberCheck(int numberI){

        if(numberI <= 1){
            System.out.println("Numbers from 1 and below are not prime numbers");
            return ;
        }
        for( int i=2; i<numberI; i++){
            if(numberI % i == 0){
                System.out.println(numberI + " is divisible by " + i);
                System.out.println(numberI + " is not a prime number");
                return ;
            }
        }

        System.out.println(numberI + " is a prime number");
    }

    public static void main(String[] args) {
//        printEvenNumbers(10);
//
//        System.out.println(evenNumberList);

        primeNumberCheck(23);
    }
}
