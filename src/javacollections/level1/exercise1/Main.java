package javacollections.level1.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> monthsList = new ArrayList<>(List.of(
                new Month("January"),
                new Month("February"),
                new Month("March"),
                new Month("April"),
                new Month("May"),
                new Month("June"),
                new Month("July"),
                new Month("September"),
                new Month("October"),
                new Month("November"),
                new Month("December")
        ));

        Month august = new Month ("August");

        monthsList.add(7, august);
        monthsList.add(7, august); //allows duplication

        System.out.println(monthsList);
        System.out.println();


        HashSet<Month> monthsSet = new HashSet<>(List.of(
                new Month("January"),
                new Month("February"),
                new Month("March"),
                new Month("April"),
                new Month("May"),
                new Month("June"),
                new Month("July"),
                new Month("September"),
                new Month("October"),
                new Month("November"),
                new Month("December")
        ));

        monthsSet.add(august);
        monthsSet.add(august); //doesn't allow duplication

        System.out.println(monthsSet);
        System.out.println();


        for (Month m : monthsSet) {
            System.out.println(m);
        }
        System.out.println();

        Iterator<Month> it = monthsSet.iterator();
        while (it.hasNext()) {
            Month m = it.next();
            System.out.println(m);
        }
    }
}