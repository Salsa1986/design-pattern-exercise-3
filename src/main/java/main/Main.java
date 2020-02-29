package main;

import pizza.*;
import pizza.factory.PizzaFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza capriciosaPizza = pizzaFactory.createPizza( PizzaType.CAPRICIOSA);
        Pizza hawaiPizza = pizzaFactory.createPizza( PizzaType.HAWAI);
        Pizza margheritaPizza = pizzaFactory.createPizza(PizzaType.MARGERITHA);

        capriciosaPizza.showPizzaInfo();
        hawaiPizza.showPizzaInfo();
        margheritaPizza.showPizzaInfo();
    }

}
