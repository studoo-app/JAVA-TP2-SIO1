package com.sio.corrections;

import java.util.Arrays;
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

                    //Creation du tableau
                    int[] tableauExo1 = {5, 10, 15, 20, 25};
                    // Affichage
//                    System.out.println("Tableau initial :");
//                    for (int i = 0; i < tableauExo1.length; i++) {
//                        System.out.print(tableauExo1[i] + " \n");
//                    }

                    // Utilisation de la méthode displayArray
                    displayArray(tableauExo1);

                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 2");
                    System.out.println("Search a value in an array");
                    System.out.println("---------------------------------------------");

                    System.out.print("Entrez un nombre à rechercher : ");
                    int[] tableauExo2 = {5, 10, 15, 20, 25};
                    int nombreRecherche = scanner.nextInt();
                    boolean trouve = false;
                    for (int i = 0; i < tableauExo2.length; i++) {
                        if (tableauExo2[i] == nombreRecherche) {
                            System.out.println("Nombre trouvé à l'indice : " + i);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Nombre non trouvé.");
                    }

                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 3");
                    System.out.println("Update a value in an array");
                    System.out.println("---------------------------------------------");

                    int[] tableauExo3 = {5, 10, 15, 20, 25};
                    System.out.println("Tableau après multiplication par 2 :");
                    for (int i = 0; i < tableauExo3.length; i++) {
                        tableauExo3[i] *= 2;
                        System.out.print(tableauExo3[i] + " \n");
                    }

                    System.out.println("---------------------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 4");
                    System.out.println("Explore by yourself");
                    System.out.println("---------------------------------------------");

                    int[] tableauExo4 = {5, 10, 15, 20, 25};
                    System.out.print("Entrez un nombre à ajouter au tableau : ");
                    int nouveauNombre = scanner.nextInt();
                    int[] nouveauTableauExo4 = Arrays.copyOf(tableauExo4, tableauExo4.length + 1);
                    nouveauTableauExo4[nouveauTableauExo4.length - 1] = nouveauNombre;

                    System.out.println("Tableau étendu : " + Arrays.toString(nouveauTableauExo4));

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

    private static void displayArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " \n");
        }
    }

    private int searchValue(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}