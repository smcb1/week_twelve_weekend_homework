import Items.Instruments.Brass.Trumpet;
import Items.Instruments.Instrument;
import Items.Instruments.Keys.Piano;
import Items.Instruments.Stringed.Guitar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private String shopName;
    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    ArrayList<Instrument> instruments;
    Shop shop;

    @Before
    public void setUp() {
        guitar = new Guitar("Gibson", "Epiphone", 499.99, 599.99, "Stringed", "Acoustic", "Wood", "Sunburst Orange", "Chuck Berry", 6);
        piano = new Piano("Keys", "Steinway", 39999.99, 49999.99, "Keys", "Acoustic", "Wood", "Black", "Beethoven", 88, 3);
        trumpet = new Trumpet("Brass", "Windsor", 59.99, 69.99, "Brass", "Acoustic", "Brass", "Gold", "Miles Davies", 3);
        shop = new Shop("Ray's Music Exchange", guitar, piano, trumpet);
        instruments = new ArrayList<Instrument>();
    }

    @Test
    public void testShopName() {
        assertEquals("Ray's Music Exchange", shop.getShopName());
    }

    @Test
    public void testShopStartsEmpty() {
        assertEquals(0, instruments.size());
    }

    @Test
    public void testAddInstrumentToShop() {
        instruments.add(guitar);
        instruments.add(piano);
        instruments.add(trumpet);
        assertEquals(3, instruments.size());
    }

    @Test
    public void testInstrument() {
        instruments.add(trumpet);
        assertEquals("Miles Davies", trumpet.play());
    }

    @Test
    public void testCalculateMarkUp() {
        assertEquals(100, shop.calculateMarkup(), 0);
    }
}
