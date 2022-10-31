package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Double, String> products = new HashMap<>();

        products.put(1.98, "Ice cream");
        products.put(1.10, "Bread");
        products.put(3.67, "Butter");
        products.put(1.98, "Beer");

        System.out.println(products);

    }
}
