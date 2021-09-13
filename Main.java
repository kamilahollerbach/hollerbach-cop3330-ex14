/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kamila Hollerbach
 */

package com.company;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double orderAmount = input.nextDouble();

        System.out.print("What is the state? ");
        String state = input.next();

        double tax;
        if(state.equalsIgnoreCase("WI")) {
            System.out.printf("The subtotal is $%.2f\n", orderAmount);

            tax = 5.5/10;
            System.out.printf("The tax is $%.2f\n", tax);
        } else {
            tax = 0;
        }

        double total = orderAmount + tax;

        System.out.printf("The total is $%.2f\n", total);

        input.close();
    }
}


