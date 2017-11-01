package com.testCases;

import org.junit.Test;

import com.versionTwo.Item;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    @Test
    public void testSetDescription() {

        try {
            Item item = new Item("Description", 0.0f);
            assertEquals("Description", item.getDescription());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    @Test
    public void testNegativePrice()
    {
        try{
            Item item = new Item("Description",-1.0f);
        }
        catch (Exception e)
        {
            assertEquals("Negative price is not allowed",e.getMessage() );
        }
    }
}
