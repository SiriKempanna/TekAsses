package com.versionTwo;
import java.util.ArrayList;
import java.util.List;

public class Order {

    //orderLines was not initialized
    private List<OrderLine> orderLines=new ArrayList<OrderLine>();

    public void add(OrderLine o) throws IllegalArgumentException {
        if (o == null) {
            System.err.println("ERROR - Order is NULL");
            throw new IllegalArgumentException("Order is NULL");
        }
        orderLines.add(o);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public int size() {
        return orderLines.size();
    }

    public OrderLine get(int i) {
        return orderLines.get(i);
    }

    public void clear() {

        this.orderLines.clear();
    }
}