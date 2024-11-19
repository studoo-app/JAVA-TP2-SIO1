package com.sio;

import java.util.Scanner;

public class PracticeArrayVsList {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercise 1");
            System.out.println("2. Exercise 2");
            System.out.println("3. Exercise 3");
            System.out.println("0. Quit");
            System.out.println("#############################################");
            System.out.print("Type your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 1");
                    System.out.println("Convert an array to a list");
                    System.out.println("---------------------------------------------");
                    //Exercise 1 : Enter your code here
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 2");
                    System.out.println("Convert a list to an array");
                    System.out.println("---------------------------------------------");
                    //Exercise 2 : Enter your code here
                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 3");
                    System.out.println("Challenge");
                    System.out.println("---------------------------------------------");
                    //Exercise 3 : Enter your code here
                    System.out.println("---------------------------------------------");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again !");
                    break;
            }
        }
    }
}