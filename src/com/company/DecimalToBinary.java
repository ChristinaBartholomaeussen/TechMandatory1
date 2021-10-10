package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DecimalToBinary {

    private boolean exit;

    public void convertDecimalToBinary() {

        while (!exit) {

            Scanner scanner = new Scanner(System.in);

            try {

                System.out.print("\nInsert your decimal number: ");
                int decimalInput = scanner.nextInt();

                int startDecimal = decimalInput;

                String binaryAsString = "";

                int result;
                int remainder;

                //Sætter result til at være inputtet divideret med 2
                //remainder sættes til inputtet % 2, dette gør, at vi får det resterende, der er tilbage.
                //Sætter det resterende til at være lige med inputtet
                //+ de to resultater sammen i en streng
                //do while loopet kører så længe resultet ikke er 0.
                do {

                    result = decimalInput / 2;

                    remainder = decimalInput % 2;

                    decimalInput = result;

                    binaryAsString = binaryAsString + remainder;

                } while (result != 0);


                String reverseStringAsBinary = "";

                for (int i = binaryAsString.length() - 1; i >= 0; i--) {
                    reverseStringAsBinary = reverseStringAsBinary + binaryAsString.charAt(i);
                }

                System.out.println("\nDecimal: " + startDecimal + " is binary: " + reverseStringAsBinary + "");
                exit = true;

            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.print("\nThis is not a decimal number.\n");

            }
        }
    }
}
