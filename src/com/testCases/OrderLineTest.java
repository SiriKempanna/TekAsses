package com.testCases;

import org.junit.Test;

import com.versionTwo.Item;
import com.versionTwo.OrderLine;

import static org.junit.Assert.assertEquals;

public class OrderLineTest {
    @Test
    public void testNegativeQuantityFromConstructor()
    {
        try{
            OrderLine orderLine = new OrderLine(new Item("Description",1.0f),1);
        }
        catch (Exception e)
        {
            assertEquals("Quantity is negative",e.getMessage() );
        }
    }
    @Test
    public void testNullItemFromConstructor()
    {
        try{
            OrderLine orderLine = new OrderLine(null,1);
        }
        catch (Exception e)
        {
            assertEquals("Item is NULL",e.getMessage() );
        }
    }

}
