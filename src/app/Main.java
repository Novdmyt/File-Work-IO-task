package app;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        getMenu();
    }
    public static void getMenu(){
        Scanner scanner = new Scanner(System.in);
        Scanner tx = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Menu:
                    1. Create and save file.
                    2. Read file.
                    3. Exit.
                                 """);
            int choice = 0;
          try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
              scanner.nextLine();
           System.out.print("Wrong input ");
             System.out.println(" ");
            continue;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter name file.");
                    String name = tx.nextLine();
                    System.out.println("Enter text in to your file");
                    String text = tx.nextLine();
                    FileWriteService.writeFile(name, text);
                }
                case 2 -> {
                    System.out.println("Enter name file");
                    String name = tx.nextLine();
                    FileReadService.fileRead(name);
                }
                case 3 -> {
                    System.out.println("Bye.");
                    System.exit(0);
                }
                default -> {
                    System.out.println("The choice is not correct.");
                }
            }
        }
    }
}

