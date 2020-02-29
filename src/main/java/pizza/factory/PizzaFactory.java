package pizza.factory;

import pizza.*;

import java.util.List;

public class PizzaFactory {
    public Pizza createPizza(double cost, List<String> components, PizzaType pizzaType) {
        if (PizzaType.CAPRICIOSA.equals(pizzaType)) {
            return new CapriciosaPizza(cost, components, pizzaType);
        } else if (PizzaType.HAWAI.equals(pizzaType)) {
            return new HawaiPizza(cost, components, pizzaType);
        } else if (PizzaType.MARGERITHA.equals(pizzaType)) {
            return new MargheritaPizza(cost, components, pizzaType);
        }
        throw new IllegalArgumentException("User type not supported");
    }
}
