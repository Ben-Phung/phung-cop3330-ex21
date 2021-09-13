/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        // Prompt user
        System.out.print("Please enter the number of the month: ");
        String Number = scan.nextLine();

        int Month = Integer.parseInt(Number);
        String strMonth;

        // Switch case with cases for each month and error
        switch (Month)
        {
            case 1: strMonth = "January";
                break;
            case 2: strMonth = "February";
                break;
            case 3: strMonth = "March";
                break;
            case 4: strMonth = "April";
                break;
            case 5: strMonth = "May";
                break;
            case 6: strMonth = "June";
                break;
            case 7: strMonth = "July";
                break;
            case 8: strMonth = "August";
                break;
            case 9: strMonth = "September";
                break;
            case 10: strMonth = "October";
                break;
            case 11: strMonth = "November";
                break;
            case 12: strMonth = "December";
                break;
            default: strMonth = "Error: Invalid month. ";
                break;
        }
        // Output
        System.out.println("The name of the month is " +strMonth);
    }
}