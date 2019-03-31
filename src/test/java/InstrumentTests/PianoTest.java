package InstrumentTests;

import Items.Instruments.Keys.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Steinway", "1942", 39999.99, 49999.99, "Keys", "Acoustic", "Wood", "Black", "Beethoven", 88, 3);
    }

    @Test
    public void testSection() {
        assertEquals("Keys", piano.getSection());
    }

    @Test
    public void testMake() {
        assertEquals("Steinway", piano.getMake());
    }

    @Test
    public void testModel() {
        assertEquals("1942", piano.getModel());
    }

    @Test
    public void testType() {
        assertEquals("Acoustic", piano.getType());
    }

    @Test
    public void testMaterial() {
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void testColour() {
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void testNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void testNumberOfPedals() {
        assertEquals(3, piano.getNumberOfPedals());
    }

    @Test
    public void testPurchasePrice() {
        assertEquals(39999.99, piano.getPurchasePrice(), 0);
    }

    @Test
    public void testSellPrice() {
        assertEquals(49999.99, piano.getSellPrice(), 0);
    }

    @Test
    public void testIPlayInterface() {
        assertEquals("Beethoven", piano.play());
    }

}

