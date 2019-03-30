package InstrumentTests;

import Instruments.Stringed.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Stringed", "Gibson", "Epiphone", "Chuck Berry", "Electric", "Wood", "Sunburst Orange", 6);
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
    public void testSound() {
        assertEquals("Chuck Berry", guitar.getSound());
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
}

