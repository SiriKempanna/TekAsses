package com.testCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ItemTest.class,
        OrderLineTest.class,
        OrderTest.class,
        CalculatorTest.class
})


public class TestFooSuite {
}
