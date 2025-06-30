package com.codewithmoshh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
       final byte MONTHS_IN_YEAR=12;
       final byte PERCENT=100;
       Scanner scanner= new Scanner(System.in);
       System.out.print("Principal: ");
       int principal= scanner.nextInt();

       System.out.print("Annual Interest Rate: ");
       float annualInterestRate= scanner.nextFloat();

       System.out.print("Period (Years): ");
       byte years= scanner.nextByte();

       float r= (annualInterestRate/PERCENT)/MONTHS_IN_YEAR; //monthly interest rate
       int n=years*MONTHS_IN_YEAR; //number of payments
       double m=(principal*r*Math.pow((1+r),n))/(Math.pow((1+r),n)-1);
       NumberFormat currency=NumberFormat.getCurrencyInstance();
       String mortgage=currency.format(m);
       System.out.println("Mortgage: "+mortgage);

    }
}
