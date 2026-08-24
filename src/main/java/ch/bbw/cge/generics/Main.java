package ch.bbw.cge.generics;

import java.util.*;

/**
 * TODO finish this explanation
 * Generics makes it possible to
 */
public class Main {
    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();
        Set<Map.Entry<String, Car>> set = new HashSet<>();
        Map<String, Car> map = new HashMap<>();

        list.add(new Car(4, 5, "limousine"));
        list.add(new Car(4, 2, "cabriolet"));
        list.add(new Car(4, 1, "small car"));
        list.add(new Car(4, 5, "SUV"));

        // we can use a customer nr to map him to his car.
        map.put("Audi", list.get(0));
        map.put("BMW", list.get(1));
        map.put("Ford", list.get(2));
        map.put("Honda", list.get(3));
    }
}
