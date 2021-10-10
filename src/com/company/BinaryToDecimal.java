package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryToDecimal {

    String reverseString = "";
    int sum = 0;
    private boolean exit;

    public void convertBinaryToDecimal() {

        while (!exit) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("\nInsert your binary number: ");
            String binaryInput = scanner.nextLine();

            if (containsElseThan1_0(binaryInput)) {
                //Reverser den streng brugeren har sat ind.
                for (int i = binaryInput.length() - 1; i >= 0; i--) {
                    reverseString = reverseString + binaryInput.charAt(i);
                }

                //Tjekker om karakteren på den specifikke position er et 1 tal.
                //Hvis det er et 1 tal kalder den metoden getValueIndex og lægger den værdi
                //til den nuværende sum.
                for (int i = 0; i < reverseString.length(); i++) {

                    if (reverseString.charAt(i) == '1') {

                        sum = sum + getValueInIndex(i);
                    }

                }
                System.out.println("\nBinary: " + binaryInput + " Decimal: " + sum);
                exit = true;

            } else {
                System.out.println("\nThis is not a binary number.");
            }
        }
    }

    //Erklærer et array med integers.
    //Loopet kører så længe at tal er mindre end 1073741824 som svarer til den højeste
    //integer itellij kan håndtere.
    //For hver gang adder den tallet til arrayet og efterfølgende tager tallet og ganger med 2.
    //Metoden gør således, at vi kan hente den værdi, som det specifikke index har.
    //Dvs. index 0 = 1, index 1 = 2 osv. istedet for, at vi skal skrive dem ind manuelt.
    public int getValueInIndex(int index) {
        ArrayList<Integer> values = new ArrayList<>();

        int tal = 1;

        for (int i = 0; tal < 1073741824; i++) {
            values.add(tal);
            tal = tal * 2;
        }

        return values.get(index);
    }

    //Metoden tjekker, om stregen indeholder andet et 1 og 0.
    //Hvis loop finder et 1 eller 0 tal, så kører den videre
    //Hvis den finder noget, som ikke er 1 eller 0, så returnerer den false
    public boolean containsElseThan1_0(String binaryInput) {
        for (int i = 0; i < binaryInput.length(); i++) {
            if (binaryInput.charAt(i) == '1') {
                continue;
            }
            if (binaryInput.charAt(i) == '0') {
                continue;

            } else {
                return false;
            }
        }
        return true;

    }

}