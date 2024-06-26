package praktikum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTest {

    private final IngredientType type;
    private final String nameIng;
    private final float priceIng;
    private static final float dif = 0;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.nameIng = name;
        this.priceIng = price;
    }

    @Parameterized.Parameters()
    public static Object[] getIngredient() {
        return new Object[][]{
                {IngredientType.SAUCE, "Чили", 20.0F},
                {IngredientType.FILLING, "Шпинат", 35.7F},// передали тестовые данные
        };
    }

    @Test
    public void shouldBeIngredientTypeTest() {
        Ingredient ingredient = new Ingredient(type, nameIng, priceIng);
        IngredientType actual = ingredient.getType();
        assertEquals(type, actual);
    }

    @Test
    public void shouldBeIngredientNameTest() {
        Ingredient ingredient = new Ingredient(type, nameIng, priceIng);
        String actual = ingredient.getName();
        assertEquals(nameIng, actual);
    }

    @Test
    public void shouldBeIngredientPriceTest() {
        Ingredient ingredient = new Ingredient(type, nameIng, priceIng);
        float actual = ingredient.getPrice();
        Assert.assertEquals(priceIng, actual, dif);
    }
}