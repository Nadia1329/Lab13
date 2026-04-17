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
        assertEquals(new ArrayList<>(), App.removeDuplicates(list));
    }

    @Test public void  testNoDuplicates() {
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
