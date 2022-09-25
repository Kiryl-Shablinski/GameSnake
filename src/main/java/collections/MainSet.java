package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> h = new LinkedHashSet<>();
        h.add("India");
        h.add("Australia");
        h.add("Belarus");
        h.add("Belarus");

        System.out.println(h);
    }
}
