package com.testCases;

import org.junit.Test;

import com.versionTwo.CalculateOrder;
import com.versionTwo.Calculator;
import com.versionTwo.Item;
import com.versionTwo.Order;
import com.versionTwo.OrderLine;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void testRoundingValidValue(){
        assertEquals(1.68d,1.67898d,0.1);
    }
    @Test
    public void testCalculatorOrderTaxAndTotalWithAllCapsImported(){

        Order order=new Order();
        try {
            order.add(new OrderLine(new Item("IMPORTED", 10.589f), 1));

            CalculateOrder calculatorResult=new Calculator().calculateOrder(order);
            assertEquals(1.58835f,calculatorResult.getTotalTax(),0.1);
            //total +tax
            assertEquals(12.17,calculatorResult.getTotalPrice()+calculatorResult.getTotalTax(),0.1f);


            //Adding another order
            order.add(new OrderLine(new Item("IMPORTED", 10.589f), 1));
            calculatorResult=new Calculator().calculateOrder(order);
            assertEquals(3.16f,calculatorResult.getTotalTax(),0.1);
            //total +tax
            assertEquals(24.35,calculatorResult.getTotalPrice()+calculatorResult.getTotalTax(),0.1f);

        }
        catch (Exception e)
        {
            assertEquals("Exception occurred: "+e.getMessage(),e.getMessage());
        }
    }
    @Test
    public void testCalculatorOrderTaxAndTotalWithRandomCaseImported(){

        Order order=new Order();
        try {
            order.add(new OrderLine(new Item("ImpORtED", 10.589f), 1));
            CalculateOrder calculatorResult=new Calculator().calculateOrder(order);
            assertEquals(1.58835f,calculatorResult.getTotalTax(),0.1);
            assertEquals(12.17f,calculatorResult.getTotalPrice()+calculatorResult.getTotalTax(),0.1f);
        }
        catch (Exception e)
        {
            assertEquals("Exception occurred: "+e.getMessage(),e.getMessage());
        }
    }
    @Test
    public void testCalculatorOrderTaxAndTotalWithLowerCaseImported(){

        Order order=new Order();
        try {
            order.add(new OrderLine(new Item("imported", 10.589f), 1));
            CalculateOrder calculatorResult=new Calculator().calculateOrder(order);
            assertEquals(1.58835f,calculatorResult.getTotalTax(),0.1);
            assertEquals(12.17f,calculatorResult.getTotalPrice()+calculatorResult.getTotalTax(),0.1f);
        }
        catch (Exception e)
        {
            assertEquals("Exception occurred: "+e.getMessage(),e.getMessage());
        }
    }
    @Test
    public void testCalculatorOrderTaxAndTotalWithInvalidImportedSpelling(){

        Order order=new Order();
        try {
            order.add(new OrderLine(new Item("imporred", 10.589f), 1));
            CalculateOrder calculatorResult=new Calculator().calculateOrder(order);
            assertEquals(1.05f,calculatorResult.getTotalTax(),0.1);
            assertEquals(11.647f,calculatorResult.getTotalPrice()+calculatorResult.getTotalTax(),0.1f);
        }
        catch (Exception e)
        {
            assertEquals("Exception occurred: "+e.getMessage(),e.getMessage());
        }
    }
    @Test
    public void testCalculatorOrderWithNotImported(){
        Order order=new Order();
        try {
            order.add(new OrderLine(new Item("Some item", 10.589f), 1));
            CalculateOrder calculatorResult=new Calculator().calculateOrder(order);
            assertEquals(1.05f,calculatorResult.getTotalTax(),0.1);
            assertEquals(11.647f,calculatorResult.getTotalPrice()+calculatorResult.getTotalTax(),0.1f);
        }
        catch (Exception e)
        {
            assertEquals("Exception occurred: "+e.getMessage(),e.getMessage());
        }

    }
    @Test
    public void testCalculateOrderMapWithNull()
    {
        Map<String, Order> orderHashMap = new HashMap<String, Order>();
        try {
            new Calculator().calculateOrderMap(null);
        }
        catch (Exception e)
        {
            assertEquals("OrderMap cannot be null",e.getMessage());
        }

    }



}
