package de.kayklein;

import junit.framework.TestCase;

import static de.kayklein.Main.MSG;

/**
 * Created with IntelliJ IDEA.
 * User: Al-Quaida
 * Date: 23.02.13
 * Time: 01:28
 * To change this template use File | Settings | File Templates.
 */
public class MainTest extends TestCase {


    public void testGetValue() throws Exception {
        int result = new Main().getValue();
        int expected = 4711;
        assertEquals(expected, result);
    }

    public void testGetMessage() throws Exception {
        String result = new Main().getMessage();
        String expected = MSG;
        assertEquals(expected, result);
    }
}
