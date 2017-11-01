package com.versionTwo;

import java.util.Map;

public class Calculator {

    public static double rounding(double value) {
        //return ( (int) (value * 100)) / 100;
        return ( (value * 100)) / 100;
    }


    public CalculateOrder calculateOrder(Order order)
    {
        double totalTax = 0;
        double total = 0;

        // Iterate through the items in the order
        //For loop condition was "<=", it should be "<"
        for (int i = 0; i < order.getOrderLines().size(); i++) {

            // Calculate the taxes
            double tax = 0;

            if (order.get(i).getItem().getDescription().toLowerCase().contains("imported")) {
                tax = rounding(order.get(i).getItem().getPrice() * 0.15); // Extra 5% tax on
                // imported items
            } else {
                tax = rounding(order.get(i).getItem().getPrice() * 0.10);
            }


            // Calculate the total price
            //double totalprice = r.get(i).getItem().getPrice() + Math.floor(tax);
            double totalprice = order.get(i).getItem().getPrice() + tax;


            // Print out the item's total price
            //System.out.println(r.get(i).getItem().getDescription() + ": " + Math.floor(totalprice));
            System.out.println(order.get(i).getQuantity()+" "+order.get(i).getItem().getDescription() + ": " + Math.round(totalprice*100.0)/100.0);
            // Keep a running total
            totalTax += tax;
            total += order.get(i).getItem().getPrice();
        }
        return new CalculateOrder(total,totalTax);
    }
    /**
     * receives a collection of orders. For each order, iterates on the order lines and calculateOrderMap the total price which
     * is the item's price * quantity * taxes.
     *
     * For each order, print the total Sales Tax paid and Total price without taxes for this order
     */
    public void calculateOrderMap(Map<String, Order> orderMap) {
        if(orderMap==null)
            throw new NullPointerException("OrderMap cannot be null");

        double grandtotal = 0;

        // Iterate through the orders
        for (Map.Entry<String, Order> entry : orderMap.entrySet()) {
            System.out.println("*******" + entry.getKey() + "*******");
            //WHY?
            // grandtotal = 0;

            Order order = entry.getValue();


            CalculateOrder calculatorResult=calculateOrder(order);


            // Print out the total taxes
            //System.out.println("Sales Tax: " + Math.floor(totalTax);
            System.out.println("Sales Tax: " + Math.floor(calculatorResult.getTotalTax()*100.0)/100.0);


            //removed this line because
            //total = total + totalTax;

            // Print out the total amount
            //System.out.println("Total: " + Math.floor(total * 100) / 100);
            System.out.println("Total: " + Math.round(calculatorResult.getTotalPrice() * 100.0) / 100.0);
            grandtotal += calculatorResult.getTotalPrice();
        }

        //System.out.println("Sum of orders: " + Math.floor(grandtotal * 100.0) / 100.0);
        System.out.println("Sum of orders: " + Math.round(grandtotal * 100.0) / 100.0);    }
}

