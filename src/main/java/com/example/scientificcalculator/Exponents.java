package com.example.scientificcalculator;
import java.lang.Math ;

public class Exponents {

    public static Double variableExponent(Double baseNum, Double exp1) {
        Double output = Math.pow(baseNum, exp1);
        Console.println( "\n" + output);
        return output;
    }

    public static Double square(Double baseNum) {
        Double output = Math.pow(baseNum, 2);
        Console.println( "\n" + output);
        return output;
    }

    public static Double cubed(Double baseNum) {
        Double output = Math.pow(baseNum, 3);
        Console.println( "\n" + output);
        return output;
    }

    public static Double sqrt(Double baseNum) {
        Double output = Math.sqrt(baseNum);
        Console.println( "\n" + output);
        return output;
    }
}