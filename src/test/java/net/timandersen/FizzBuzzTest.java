package net.timandersen;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void firstNumberIsOne() throws Exception {
        assertLine(1);
    }

    @Test
    public void secondNumberIsTwo() throws Exception {
        assertLine(2);
    }

    @Test
    public void thirdNumberIsFizz() throws Exception {
        assertLine(3, "Fizz");
    }

    @Test
    public void moreNumbers() throws Exception {
        assertLine(4);
        assertLine(5, "Buzz");
        assertLine(6, "Fizz");
        assertLine(7);
        assertLine(8);
        assertLine(9, "Fizz");
        assertLine(10, "Buzz");
        assertLine(11);
        assertLine(12, "Fizz");
        assertLine(13);
        assertLine(14);
        assertLine(15, "FizzBuzz");
        assertLine(45, "FizzBuzz");
        assertLine(90, "FizzBuzz");
        assertLine(100, "Buzz");
    }

    private void assertLine(int index) {
        assertLine(index, index + "");
    }

    private void assertLine(int index, String expected) {
        assertEquals(expected, new FizzBuzz().print().split(System.lineSeparator())[index - 1]);
    }

}
