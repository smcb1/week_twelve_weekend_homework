package InstrumentTests;

import Instruments.Keys.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp() {
        piano = new Piano("Keys", "Steinway", "1942", "Beethoven", "Acoustic Grand", "Wood", "Black", 88, 3);
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
        assertEquals("Acoustic Grand", piano.getType());
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
    public void testIPlayInterface() {
        assertEquals("Beethoven", piano.play());
    }

}

