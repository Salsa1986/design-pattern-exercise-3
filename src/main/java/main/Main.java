package main;

import pizza.*;
import pizza.factory.PizzaFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza capriciosaPizza = pizzaFactory.createPizza(31.99,Arrays.asList("cheese","champignons","ham"), PizzaType.CAPRICIOSA);
        Pizza hawaiPizza = pizzaFactory.createPizza(29.99,Arrays.asList("cheese","pineaple","ham"), PizzaType.HAWAI);
        Pizza margheritaPizza = pizzaFactory.createPizza(24, Arrays.asList("cheese"), PizzaType.MARGERITHA);

        capriciosaPizza.showPizzaInfo();
        hawaiPizza.showPizzaInfo();
        margheritaPizza.showPizzaInfo();
    }

}
