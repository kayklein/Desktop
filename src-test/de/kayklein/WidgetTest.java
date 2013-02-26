package de.kayklein;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: ios_developer
 * Date: 26.02.13
 * Time: 13:29
 * To change this template use File | Settings | File Templates.
 */
public class WidgetTest {


    @Test
    public void testGetInteger() throws Exception {

        int expected = 4711;
        int result = new Widget().getInteger();

        assertEquals(expected, result);

    }

    @Test
    public void testGetTrue() throws Exception {

        boolean expected = true;
        boolean result = new Widget().getTrue();
        assertEquals(expected, result);
    }

    @Test
    public void testGetName() throws Exception {
        String expected = "Widget";
        String result = new Widget().getName();
        assertEquals(expected, result);

    }
}
