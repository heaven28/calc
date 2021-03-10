package com.example.scientificcalculator;

public class Submenu {

    public static void arithmeticMenu() {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Add \n" +
                        "2. Subtract \n" +
                        "3. Multiply \n" +
                        "4. Divide \n" +
                        "5. Return to Arithmetic Menu \n" +
                        "6. Return to Main Menu \n");

        Operations.performArithmeticOperation(input2);


    }

    public static void trigonometryMenu() {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Tangent \n" +
                        "2. Sine \n" +
                        "3. Cosine \n" +
                        "4. Inverse Tangent \n" +
                        "5. Inverse Cosine \n" +
                        "6. Inverse Sine \n" +
                        "7. Return to Trig Menu \n" +
                        "8. Return to Main Menu \n");

        Operations.performTrigonometryOperation(input2);


    }

    public static void exponentsMenu() {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Square \n" +
                        "2. Cube \n" +
                        "3. Variable Exponent \n" +
                        "5. Square Root \n" +
                        "4. Return to Exponent Menu \n" +
                        "5. Return to Main Menu \n");

        Operations.performExponentOperation(input2);


    }

    public static void inversionMenu() {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Invert Sign \n" +
                        "2. 1 / x \n" +
                        "3. Return to Main Menu \n");

        Operations.performInversionOperation(input2);


    }

    public static void miscMenu() {

        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Absolute Value \n"
                        //"2.  \n" +
                        //"3.  \n"
                        );

        Operations.performMiscOperation(input2);


    }

    public static void logarithmsMenu() {
        Integer input2 = Console.getIntegerInput(
                "Pick an operation by entering a number and pressing enter. \n" +
                        "1. Natural Log \n" +
                        "2. Log Base 10 \n"
                //"3.  \n"
        );
        Operations.performLogarithmOperation(input2);
    }

}