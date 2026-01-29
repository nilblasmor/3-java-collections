package javacollections.level1.exercise2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> intList1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        ArrayList<Integer> intList2 = new ArrayList<>(List.of(5, 4, 3, 2, 1));

        Iterator<Integer> it = intList1.iterator();
        while (it.hasNext()) {
            Integer in = it.next();
            intList2.add(in);
        }
        System.out.println(intList2);

    }
}