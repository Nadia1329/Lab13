package org.example;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {
       public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> seen = new HashSet<>(list);
        return new ArrayList<>(seen);
       }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("A");
        words.add("A");
        words.add("B");
        System.out.println(removeDuplicates(words));
    }
}
