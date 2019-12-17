package com.kaushaltop;

import java.util.ArrayList;

public class GroceryList {

    public ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItems(String item) {

        groceryList.add(item);
    }

    public String printSpecificItem(int index) {

        return groceryList.get(index);
    }

    public void printGroceryList() {

        System.out.println("Total items in list: "+groceryList.size());

        for (int i=0; i<groceryList.size(); i++) {

            System.out.println((i+1)+") "+groceryList.get(i));

        }
    }

    public void modifyGroceryList(int position, String newItem) {

        groceryList.set(position, newItem);

    }

    public void removeGroceryItem(int position) {

        groceryList.remove(position);
        System.out.println("Item "+(position+1)+" removed!");

    }

    public String searchItem(String name) {

        if (groceryList.contains(name)) {

            System.out.println("Searching "+name+"...");
            System.out.println("Item "+"'"+name+"'"+" present!");

            return name;

        } else {

            System.out.println("Item not present");
            return null;

        }
    }

}
