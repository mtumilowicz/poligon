package problems.enums;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by mtumilowicz on 2017-06-17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getEnumMap());
    }
    
    private static List<Order> getShuffledList() {
        LinkedList<Order> orders = new LinkedList<>();

        int k = 0;
        for (OrderStatus status : OrderStatus.values()) {
            for (int i = k; i < k+2; i++) {
                orders.add(new Order(i, status));
            }
            k = k + 2;
        }

        Collections.shuffle(orders);
        
        return orders;
    }
    
    private static EnumMap<OrderStatus, List<Order>> getEnumMap() {
        return getShuffledList().stream()
                .sorted()
                .collect(Collectors.groupingBy(Order::getStatus))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (x, y) -> {throw new AssertionError();},
                        () -> new EnumMap<>(OrderStatus.class)
                ));
    }
    
}
