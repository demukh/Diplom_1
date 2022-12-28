import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {
    private Bun bun;

    @Before
    public void newBun() {
        bun = new Bun("test bun", 5.87f);
    }
    @Test
    public void shouldGetName() {
        assertEquals("test bun", bun.getName());
    }
    @Test
    public void shouldGetPrice() {
        assertEquals(5.87f, bun.getPrice(), 0);
    }
}
