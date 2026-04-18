package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class AppTest {
    @Test public void testEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        assertEquals(new ArrayList<>(), App.removeDuplicates(list));
    }

    @Test public void testSingleElement() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        assertEquals(expected, App.removeDuplicates(list));
    }

    @Test public void  testNoDuplicates() {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       assertEquals(new ArrayList<>(list), App.removeDuplicates(list));
    }

    @Test public void testWithDuplicates() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("B");
        ArrayList<String> expected = new ArrayList<>();
       expected.add("A");
       expected.add("B");
       assertEquals(expected, App.removeDuplicates(list));
    }
}
