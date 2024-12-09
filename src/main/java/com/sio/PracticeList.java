package com.sio;

import java.util.*;

public class PracticeList {
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
                    System.out.println("Create and display a list");
                    System.out.println("---------------------------------------------");
                    //Exercise 1 : Enter your code here

                    List<String> listeExo1 = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana"));
                    listeExo1.add("Eve");

                    for(String nom : listeExo1){
                        System.out.println(nom);
                    }


                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 2");
                    System.out.println("Search a value in a list");
                    System.out.println("---------------------------------------------");
                    //Exercise 2 : Enter your code here
                    List<String> listeExo2 = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana"));
                    System.out.print("Entrez un nom à rechercher : ");
                    String nomRecherche = scanner.next();
                    boolean trouve = listeExo2.contains(nomRecherche);
                    System.out.println(trouve ? "Nom trouvé." : "Nom non trouvé.");


                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 3");
                    System.out.println("Delete a value in a list");
                    System.out.println("---------------------------------------------");
                    //Exercise 3 : Enter your code here
                    List<String> listeExo3 = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana"));
                    listeExo3.remove("Charlie");
                    System.out.println("Liste après suppression de Charlie : " + listeExo3);

                    System.out.println("---------------------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercise 4");
                    System.out.println("Order a list");
                    System.out.println("---------------------------------------------");
                    //Exercise 4 : Enter your code here
                    List<String> listeExo4 = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Diana"));
                    Collections.sort(listeExo4);
                    System.out.println("Liste triée : " + listeExo4);

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