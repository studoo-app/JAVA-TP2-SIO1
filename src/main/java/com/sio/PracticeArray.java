package com.sio;

import java.util.Scanner;

public class PracticeArray {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercise 1");
            System.out.println("2. Exercise 2");
            System.out.println("3. Exercise 3");
            System.out.println("4. Exercise 4");
            System.out.println("0. Quit");
            System.out.println("#############################################");
            System.out.print("Type your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 1");
                    System.out.println("Create and display an array");
                    System.out.println("---------------------------------------------");
                    //Exercise 1 : Enter your code here
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 2");
                    System.out.println("Search a value in an array");
                    System.out.println("---------------------------------------------");
                    //Exercise 2 : Enter your code here
                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 3");
                    System.out.println("Update a value in an array");
                    System.out.println("---------------------------------------------");
                    //Exercise 3 : Enter your code here
                    System.out.println("---------------------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 4");
                    System.out.println("Explore by yourself");
                    System.out.println("---------------------------------------------");
                    //Exercise 4 : Enter your code here
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