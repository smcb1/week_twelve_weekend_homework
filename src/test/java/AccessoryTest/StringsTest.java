package AccessoryTest;

import Items.Accessories.AccessoryType;
import Items.Accessories.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings strings;

    @Before
    public void setUp() {
        strings = new Strings("Elixir", "Lightweight", 7.99, 9.99, AccessoryType.STRINGS);
    }

    @Test
    public void testHasMake() {
        assertEquals("Elixir", strings.getMake());
    }

    @Test
    public void testHasModel() {
        assertEquals("Lightweight", strings.getModel());
    }

    @Test
    public void testPurchasePrice() {
        assertEquals(7.99, strings.getPurchasePrice(), 0);
    }

    @Test
    public void testSellPrice() {
        assertEquals(9.99, strings.getSellPrice(), 0);
    }

    @Test
    public void testAccessoryType() {
        assertEquals(AccessoryType.STRINGS, strings.getAccessoryType());
    }
}
