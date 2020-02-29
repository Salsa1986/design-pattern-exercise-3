package pizza.factory;

import pizza.*;

import java.util.Arrays;
import java.util.List;

public class PizzaFactory {
    public Pizza createPizza(PizzaType pizzaType) {
        if (PizzaType.CAPRICIOSA.equals(pizzaType)) {
            return new CapriciosaPizza(31.99, Arrays.asList("cheese","champignons","ham"), pizzaType);
        } else if (PizzaType.HAWAI.equals(pizzaType)) {
            return new HawaiPizza(29.99,Arrays.asList("cheese","pineaple","ham"), pizzaType);
        } else if (PizzaType.MARGERITHA.equals(pizzaType)) {
            return new MargheritaPizza(24, Arrays.asList("cheese"),  pizzaType);
        }
        throw new IllegalArgumentException("User type not supported");
    }
}
