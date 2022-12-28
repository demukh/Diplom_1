import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;
import static org.junit.Assert.*;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class PriceTest {

    private final IngredientType sauce = SAUCE;
    private final float bunPrice;
    private final float ingredientPrice;
    private final float expectedPrice;

    public PriceTest(float bunPrice, float ingredientPrice, float expectedPrice) {
        this.bunPrice = bunPrice;
        this.ingredientPrice = ingredientPrice;
        this.expectedPrice = expectedPrice;
    }
    @Parameterized.Parameters(name = "Тестовые данные: {0} {1} {2}")
    public static Object[][] getBurgerData() {
        return new Object[][]{
                {0, 0, 0},
                {0, 50, 50},
                {80, 0, 160},
                {100, 100, 300},
                {3.87f, 5.55f, 13.29f},
        };
    }
    @Test
    public void shouldGetPrice() {
        Burger burger = new Burger();
        Bun bun = new Bun("test bun", bunPrice);
        burger.setBuns(bun);
        Ingredient ingredient = new Ingredient(sauce, "test filling", ingredientPrice);
        burger.addIngredient(ingredient);
        assertEquals(expectedPrice, burger.getPrice(), 0.0);
    }
}