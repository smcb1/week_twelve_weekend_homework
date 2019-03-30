package InstrumentTests;

import Instruments.Brass.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp() {
        trumpet = new Trumpet("Brass", "Windsor", "Student Bb", "Miles Davies", "Acoustic", "Brass", "Gold", 3, 99.99, 199.99);
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
        assertEquals(99.99, trumpet.getPurchasePrice(), 0);
    }

    @Test
    public void testSellPrice() {
        assertEquals(199.99, trumpet.getSalePrice(), 0);
    }

    @Test
    public void testIPlayInterface() {
        assertEquals("Miles Davies", trumpet.play());
    }

}
