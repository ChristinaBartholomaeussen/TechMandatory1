package com.company;

import java.util.Scanner;

public class Menu {

    private boolean exit;

    public void printMenu() {
        System.out.println("\nChoose one of the following options: ");
        System.out.println("1) Calculate Binary to Decimal");
        System.out.println("2) Calculate Decimal to Binary");
        System.out.println("0) Exit");
    }

    public void runMenu() {
        while (!exit) {
            printMenu();
            int chioce = getInput();
            performAction(chioce);
        }

    }

    public int getInput() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice < 0 || choice > 2) {
            try {
                System.out.print("\nInsert your choice: ");
                choice = Integer.parseInt(scanner.nextLine());


            } catch (NumberFormatException e) {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
        return choice;
    }

    public void performAction(int choice) {
        switch (choice) {
            case 0:
                exit = true;
                System.out.println("Thank you for using the calculater.");
                break;

            case 1:
                BinaryToDecimal binaryToDecimal = new BinaryToDecimal();
                binaryToDecimal.convertBinaryToDecimal();
                break;
            case 2:
                DecimalToBinary decimalToBinary = new DecimalToBinary();
                decimalToBinary.convertDecimalToBinary();
                break;
            default:
                System.out.printf("Error");

        }
    }
}
