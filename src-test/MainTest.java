import de.kayklein.Main;
import org.junit.Test;

import static de.kayklein.Main.MSG;
import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Al-Quaida
 * Date: 23.02.13
 * Time: 01:34
 * To change this template use File | Settings | File Templates.
 */
public class MainTest {


    @Test
    public void testGetValue() throws Exception {
        int result = new Main().getValue();
        int expected = 4711;
        assertEquals(expected, result);
    }

    @Test
    public void testGetMessage() throws Exception {
        String result = new Main().getMessage();
        String expected = MSG;
        assertEquals(expected, result);
    }
}
