package praktikum;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {
    String nameBun = "Хорошо";
    float priceBun = 5.10F;
    private static final float dif = 0;

    @Test
    public void shouldBeBunNameTest() {
        Bun bun = new Bun(nameBun, priceBun);
        String actual = bun.getName();
        assertEquals(nameBun, actual);
    }

    @Test
    public void shouldBeBunPriceTest() {
        Bun bun = new Bun(nameBun, priceBun);
        float actual = bun.getPrice();
        Assert.assertEquals(priceBun, actual, dif);
    }
}