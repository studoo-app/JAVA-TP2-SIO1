package com.sio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
                    int[] tableau = {10, 20, 30, 40, 50};
                    List<Integer> liste = new ArrayList<>();
                    for (int nombre : tableau) {
                        liste.add(nombre);
                    }
                    System.out.println("Liste convertie depuis le tableau : " + liste);

                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 2");
                    System.out.println("Convert a list to an array");
                    System.out.println("---------------------------------------------");
                    //Exercise 2 : Enter your code here
                    List<String> listeNoms = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
                    //String[] tableauNoms = listeNoms.toArray(new String[0]);

                    String[] tableauNoms = new String[listeNoms.size()];
                    listeNoms.toArray(tableauNoms);

                    System.out.println("Tableau converti depuis la liste : " + Arrays.toString(tableauNoms));


                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 3");
                    System.out.println("Challenge");
                    System.out.println("---------------------------------------------");
                    //Exercise 3 : Enter your code here
                    System.out.println("Entrez des nombres (séparés par des espaces) :");
                    String input = scanner.nextLine();
                    String[] inputArray = input.split(" ");

                    // Conversion en liste d'entiers
                    List<Integer> nombres = new ArrayList<>();
                    for (String s : inputArray) {
                        nombres.add(Integer.parseInt(s));
                    }

                    // Suppression des nombres pairs
                    List<Integer> nombresImpairs = supprimerNombresPairs(nombres);
                    System.out.println("Liste avec uniquement les nombres impairs : " + nombresImpairs);
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

    private static List<Integer> supprimerNombresPairs(List<Integer> liste) {
        List<Integer> result = new ArrayList<>();
        for (int nombre : liste) {
            if (nombre % 2 != 0) {
                result.add(nombre);
            }
        }
        return result;
    }
}