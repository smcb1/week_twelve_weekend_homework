package InstrumentTests;

import Items.Instruments.Stringed.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Gibson", "Epiphone", 499.99, 599.99, "Stringed", "Electric", "Wood", "Sunburst Orange", "Chuck Berry", 6);
    }

    @Test
    public void testSection() {
        assertEquals("Stringed", guitar.getSection());
    }

    @Test
    public void testMake() {
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void testModel() {
        assertEquals("Epiphone", guitar.getModel());
    }

    @Test
    public void testType() {
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void testMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void testColour() {
        assertEquals("Sunburst Orange", guitar.getColour());
    }

    @Test
    public void testNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void testPurchasePrice() {
        assertEquals(499.99, guitar.getPurchasePrice(), 0);
    }

    @Test
    public void testSellPrice() {
        assertEquals(599.99, guitar.getSellPrice(), 0);
    }

    @Test
    public void testIPlayInterface() {
        assertEquals("Chuck Berry", guitar.play());
    }
}

