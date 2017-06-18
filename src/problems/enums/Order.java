package problems.enums;

import java.util.Objects;

/**
 * Created by mtumilowicz on 2017-06-17.
 */
public class Order implements Comparable<Order> {
    
    private final Integer id;
    
    private final OrderStatus status;

    public Order(Integer id, OrderStatus status) {
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }

    @Override
    public int compareTo(Order o) {
        return id.compareTo(o.id);
    }
}
