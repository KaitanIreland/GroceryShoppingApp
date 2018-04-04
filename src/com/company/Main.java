package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<LocalDate> localDates = new ArrayList<>();
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> prices = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        LocalDate today = LocalDate.of(2018,4,4);
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

	//How many items were purchased during the last visit to the grocery store?
        LocalDate agesAgo = today.minusYears(30);
        LocalDate minimum;
        String purchasedLast = " ";
        for (int i = 0; i < localDates.size(); i++) {
            if (localDates.get(i).isAfter(agesAgo)) {
                minimum = localDates.get(i);
                purchasedLast = products.get(i);
            }
        }
        System.out.println("During the last visit to the grocery store, these items were purchased:" + "\n" + purchasedLast);
    //TODO
    //TODO How
    }
}
