package Memento.game;

import java.util.*;

public class Memento {
    int money;
    ArrayList fruits;

    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruits(String fruit) {
        fruits.add(fruit);
    }

    List getFruits() {
        return (List) fruits.clone();
    }


}
