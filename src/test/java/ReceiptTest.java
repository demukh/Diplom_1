import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class ReceiptTest {
    Bun bun = new Bun("cosmic bun", 5.03F);

    Ingredient cosmicCheese = new Ingredient(IngredientType.SAUCE, "cosmicCheese", 7.13F);
    Ingredient cosmicMushroom = new Ingredient(IngredientType.SAUCE, "cosmicMushroom", 9.08F);

    String expected = "(==== cosmic bun ====)\r\n" +
            "= sauce cosmicCheese =\r\n" +
            "= sauce cosmicMushroom =\r\n" +
            "(==== cosmic bun ====)\r\n" +
            "\r\n" +
            "Price: 26,270000\r\n";


    @Test
    public void BurgerReceiptTest() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(cosmicCheese);
        burger.addIngredient(cosmicMushroom);
        String actualReceipt = burger.getReceipt();
        Assert.assertEquals(expected, actualReceipt);
    }
}
