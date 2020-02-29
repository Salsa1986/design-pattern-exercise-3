package pizza;

import java.util.List;

public class HawaiPizza extends Pizza {

    public HawaiPizza(double cost, List<String> components, PizzaType pizzaType) {
        super(cost, components, pizzaType);
    }

    @Override
    public String toString() {
        return "HawaiPizza{} " + super.toString();
    }

    public void showPizzaInfo() {
        System.out.println(this.toString());
    }
}
