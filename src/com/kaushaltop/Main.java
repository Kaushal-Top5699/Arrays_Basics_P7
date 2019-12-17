package com.kaushaltop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static GroceryList groceryList = new GroceryList();

    private static ArrayList<String> newArray = new ArrayList<>();

    public static void main(String[] args) {

        boolean quite = false;
        int choice = 0;
        printInstructions();

        while (!quite) {

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 0:
                    printInstructions();
                    break;

                case 1:
                    groceryList.printGroceryList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:
                    modifyItem();
                    break;

                case 4:
                    removeItem();
                    break;

                case 5:
                    searchItem();
                    break;

                case 6:
                    processArrayList();
                    break;

                case 7:
                    printNewArray();
                    break;

                case 8:
                    quite = true;
                    break;
            }
        }
    }

    public static void printInstructions() {

        System.out.println("Press");
        System.out.println("0 to print options");
        System.out.println("1 to print grocery list");
        System.out.println("2 to add item in the list");
        System.out.println("3 to modify item in the list");
        System.out.println("4 to remove item in the list");
        System.out.println("5 to search for item in the list");
        System.out.println("6 to copy items to new array");
        System.out.println("7 to print new array list");
        System.out.println("8 to quit");

    }

    public static void addItem() {

        System.out.print("Enter grocery items: ");
        groceryList.addGroceryItems(scanner.nextLine());

    }

    public static void modifyItem() {

        System.out.print("Enter item position of the item you want to modify: ");
        int itemPosition = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the replacement item: ");
        String replaceItem = scanner.nextLine();

        groceryList.modifyGroceryList(itemPosition-1, replaceItem);

    }

    public static void removeItem() {

        System.out.print("Enter item position you want to remove: ");
        int itemPosition = scanner.nextInt();

        groceryList.removeGroceryItem(itemPosition-1);

    }

    public static void searchItem() {

        System.out.print("Enter the item name you want to search: ");
        String itemName = scanner.nextLine();

        groceryList.searchItem(itemName);

    }

    public static void processArrayList() {

        newArray.addAll(groceryList.getGroceryList());
        System.out.println("Successfully, copied to new array!");

    }

    public static void printNewArray() {

        System.out.println("Printing new array...");
        System.out.println("Items in new array are: ");

        for (int i=0; i<newArray.size(); i++) {

            System.out.println((i+1)+") "+newArray.get(i));

        }
    }
}
