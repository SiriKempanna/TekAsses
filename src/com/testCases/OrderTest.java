package com.testCases;

import org.junit.Test;

import com.versionTwo.Item;
import com.versionTwo.Order;
import com.versionTwo.OrderLine;

import static org.junit.Assert.assertEquals;

public class OrderTest {

    @Test
    public void testAddValidOrder()
    {
        Order order=new Order();
        try {
            order.add(new OrderLine(new Item("Description",1.0f),1));
            assertEquals(1.0f,order.get(0).getItem().getPrice() ,0.1f);
            assertEquals(1,order.get(0).getQuantity() );
            assertEquals("Description",order.get(0).getItem().getDescription());
        } catch (Exception e) {
            assertEquals("Exception Occurred: "+e.getMessage(),e.getMessage());

        }
    }

    @Test
    public void testAddNullOrder()
    {
        Order order=new Order();
        try {
            order.add(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Order is NULL",e.getMessage() );
        }
    }

}
