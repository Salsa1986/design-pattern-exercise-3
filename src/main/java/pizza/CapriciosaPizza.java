package pizza;

import java.util.Arrays;
import java.util.List;

public class CapriciosaPizza extends Pizza{

    public CapriciosaPizza(double cost, List<String> components, PizzaType pizzaType) {
        super(cost, components, pizzaType);
    }

    @Override
    public String toString() {
        return "CapriciosaPizza{} " + super.toString();
    }

    public void showPizzaInfo() {
        System.out.println(this.toString());
    }


}
