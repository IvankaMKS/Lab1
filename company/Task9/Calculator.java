package com.company.Task9;

public class Calculator {
    private static double add(final double number1, final double number2){
        final CustomDouble cd1 = new CustomDouble(number1);
        final CustomDouble cd2 = new CustomDouble(number2);
        return cd1.addition (cd2).toDouble();
    }
    private static double mul(final double number1, final double number2){
        final CustomDouble cd1 = new CustomDouble(number1);
        final CustomDouble cd2 = new CustomDouble(number2);
        return cd1.multiplication (cd2).toDouble();
    }
    private static double sub(final double number1, final double number2){
        final CustomDouble cd1 = new CustomDouble(number1);
        final CustomDouble cd2 = new CustomDouble(number2);
        return cd1.subtraction (cd2).toDouble();
    }
    private static double div(final double number1, final double number2) throws Exception {
        final CustomDouble cd1 = new CustomDouble(number1);
        final CustomDouble cd2 = new CustomDouble(number2);
        return cd1.division(cd2).toDouble();
    }
    static double calculatorChange(final double number1, final double number2, final char char1) throws Exception {
        switch (char1){
            case '+':
                add (number1,number2);
            case '*':
                return mul (number1, number2);
            case '/':
                return div (number1,number2);
            case '-':
                return sub (number1, number2);
            default:
                System.out.println ("Invalid numbers, enter +, -,*, /");
                return 0;

        }
    }

}
