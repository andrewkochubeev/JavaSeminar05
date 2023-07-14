package Homework;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    static void add(String surName, int number) {
        if (phoneBook.containsKey(surName)) {
            phoneBook.get(surName).add(number);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(number);
            phoneBook.put(surName, list);
        }
    }
    static void get(String surName){
        System.out.println("Результат по запросу " + surName + ":");
        for (int phNum : phoneBook.get(surName)) {
            System.out.println("\t" + phNum);
        }
    }

}
