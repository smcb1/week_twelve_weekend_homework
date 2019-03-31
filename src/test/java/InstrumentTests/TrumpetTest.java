package InstrumentTests;

import Items.Instruments.Brass.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("Windsor", "Student Bb", 59.99, 69.99, "Brass", "Acoustic", "Brass", "Gold", "Miles Davies", 3);
    }

    @Test
    public void testSection() {
        assertEquals("Brass", trumpet.getSection());
    }

    @Test
    public void testMake() {
        assertEquals("Windsor", trumpet.getMake());
    }

    @Test
    public void testModel() {
        assertEquals("Student Bb", trumpet.getModel());
    }

    @Test
    public void testType() {
        assertEquals("Acoustic", trumpet.getType());
    }

    @Test
    public void testMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void testColour() {
        assertEquals("Gold", trumpet.getColour());
    }

    @Test
    public void testNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void testPurchasePrice() {
        assertEquals(59.99, trumpet.getPurchasePrice(), 0);
    }

    @Test
    public void testSellPrice() {
        assertEquals(69.99, trumpet.getSellPrice(), 0);
    }

    @Test
    public void testIPlayInterface() {
        assertEquals("Miles Davies", trumpet.play());
    }

}
