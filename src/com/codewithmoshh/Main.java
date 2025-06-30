package com.codewithmoshh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
        int principal;
        float annualInterestRate;
        byte years;
        Scanner scanner= new Scanner(System.in);

        while(true){
            System.out.print("Principal ($1k - $1M): ");
            principal= scanner.nextInt();
            if(principal>=1000 && principal<=1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");

        }

        while(true){
            System.out.print("Annual Interest Rate: ");
            annualInterestRate= scanner.nextFloat();
            if(annualInterestRate>0 && annualInterestRate<=30)
                break;
            System.out.println("Enter a value greater than zero and less than or equals to 30.");

        }


        while(true){
            System.out.print("Period (Years): ");
            years= scanner.nextByte();
            if(years>0 && years<=30)
                break;
            System.out.println("Enter a value between 1 and 30.");
            
        }

        float r= (annualInterestRate/PERCENT)/MONTHS_IN_YEAR; //monthly interest rate
        int n=years*MONTHS_IN_YEAR; //number of payments
        double m=(principal*r*Math.pow((1+r),n))/(Math.pow((1+r),n)-1);
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String mortgage=currency.format(m);
        System.out.println("Mortgage: "+mortgage);

    }
}