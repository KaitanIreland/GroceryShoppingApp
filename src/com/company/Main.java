package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to the Grocery Shopping App.");
        System.out.println("===========================================");
        ArrayList<LocalDate> localDates = new ArrayList<>();
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> prices = new ArrayList<>();
        initializeArrayLists(localDates, products, prices);

        //How many items were purchased during the last visit to the grocery store?
        System.out.println(howManyItems(localDates, products, prices));


        //What is the total price of items purchased on date [D]
        //I'm assuming date D is the most recent date

        System.out.println("\nThe total cost of all of these item(s) was:" + "\n" + "$" + findCostOfTrip(localDates,products,prices));


        //How many times was [A] purchased?
        System.out.println(findTimesPurchased(localDates,products,prices));



        //TODO What items were purchased that cost more than $10?


    }
    private static void initializeArrayLists(ArrayList<LocalDate> localDates, ArrayList<String> products, ArrayList<Integer> prices) {
        Scanner sc = new Scanner(System.in);
        LocalDate today = LocalDate.of(2018, 4, 4);
        localDates.add(today.minusDays(94));
        localDates.add(today.minusDays(3));
        localDates.add(today.minusDays(64));
        localDates.add(today.minusDays(32));
        localDates.add(today.minusDays(32));
        products.add("Milk, a gallon");
        products.add("Eggs, a dozen");
        products.add("Potatoes, ten");
        products.add("Apples, 5");
        products.add("Cereal, two boxes");
        prices.add(4);
        prices.add(3);
        prices.add(14);
        prices.add(9);
        prices.add(8);

    }
    private static String howManyItems(ArrayList<LocalDate> localDates, ArrayList<String> products, ArrayList<Integer> prices) {
        LocalDate today = LocalDate.of(2018, 4, 4);
        LocalDate agesAgo = today.minusYears(30);
        LocalDate minimum;
        String purchasedLast = " ";
        int costOfTrip = 0;
        for (int i = 0; i < localDates.size(); i++) {
            if (localDates.get(i).isAfter(agesAgo)) {
                minimum = localDates.get(i);
                purchasedLast = products.get(i);
                costOfTrip = prices.get(i);
            }
        }
        String statement = "During the last visit to the grocery store, these item(s) were purchased:" + "\n" + purchasedLast;
        return statement;
    }
    private static Integer findCostOfTrip(ArrayList<LocalDate> localDates, ArrayList<String> products, ArrayList<Integer> prices) {
        LocalDate today = LocalDate.of(2018, 4, 4);
        LocalDate agesAgo = today.minusYears(30);
        LocalDate minimum;
        String purchasedLast = " ";
        int costOfTrip = 0;
        for (int i = 0; i < localDates.size(); i++) {
            if (localDates.get(i).isAfter(agesAgo)) {
                minimum = localDates.get(i);
                purchasedLast = products.get(i);
                costOfTrip = prices.get(i);
            }
        }
        return costOfTrip;
    }
    private static String findTimesPurchased(ArrayList<LocalDate> localDates, ArrayList<String> products, ArrayList<Integer> prices) {
        LocalDate today = LocalDate.of(2018, 4, 4);
        LocalDate agesAgo = today.minusYears(30);
        String purchasedLast = " ";
        int costOfTrip = 0;
        int count = 0;
        int sum;
        LocalDate maxDate = localDates.get(0);
        for (int u = 0; u < localDates.size(); u++) {
            if (localDates.get(u).isAfter(maxDate)) {
                maxDate = localDates.get(u);
            }
        }
        String productCorrelated = " ";
        for (int i = 0; i < localDates.size(); i++) {
            if (localDates.get(i).equals(maxDate)) {
                productCorrelated = products.get(i);
                    }
                }
        String statement2 = "\n" + productCorrelated + " was purchased " + count + " time(s).";
        return statement2;
    }
}

