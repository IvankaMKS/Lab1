package com.company.Task9;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) throws Exception {
        final Scanner scanner = new Scanner (System.in);
        System.out.print("Enter a fraction number1: ");
        final double number1 = scanner.nextDouble ();
        System.out.print("Enter a fraction number2: ");
        final double number2 = scanner.nextDouble ();
        System.out.print("Enter +,  -, *, / ");
        final char char1 = (char) System.in.read ();

        /////////////////////////////////////////////////////////////////////////

        System.out.println (Calculator.calculatorChange (number1,number2,char1));
    }
}
