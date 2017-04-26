import com.max.main.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeTest {
    @Test
    public void testSum() {
        Main main = new Main();

        assertEquals("2 + 2 must be 4", 4, main.sum(2, 2));
    }
}
