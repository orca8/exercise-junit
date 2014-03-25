package orca8;

import java.util.ArrayList;
import java.util.List;

/**
 * exercise-junit
 */
public class FizzBuzz {

    public static List<String> createFizzBuzzList(int size) {
        ArrayList<String> list = new ArrayList<String>(size);
        for (int i = 1; i <= size; i++) {
            if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
