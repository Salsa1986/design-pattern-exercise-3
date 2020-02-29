package pizza;

import java.util.Arrays;
import java.util.List;

public class MargheritaPizza extends Pizza{

    public MargheritaPizza(double cost, List<String> components, PizzaType pizzaType) {
        super(cost, components, pizzaType);
    }

    @Override
    public String toString() {
        return "MargheritaPizza{} " + super.toString();
    }

    public void showPizzaInfo() {
        System.out.println(this.toString());
    }
}
