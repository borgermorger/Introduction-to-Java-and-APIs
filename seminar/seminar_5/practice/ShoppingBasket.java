package specialization_programmer.intruduction_to_java.seminar.seminar_5.practice;

import java.util.HashMap;

public class ShoppingBasket {
    private HashMap<String, Integer> basket = new HashMap<>();

    public void addProduct(String product, Integer quantity) {
        if (basket.containsKey(product)) {
            basket.put(product, basket.get(product) + quantity);
        } else {
            basket.put(product, quantity);
        }
    }

    public void removeProduct(String product) {
        if (basket.containsKey(product)) {
            basket.remove(product);
        }
    }

    public void updateQuantity(String product, Integer quantity) {
        if (basket.containsKey(product)) {
            basket.put(product, quantity);
        }
    }

    public int checkProduct(String product) {
        return basket.getOrDefault(product, 0);
    }

    public void showBasket() {
        if (basket.isEmpty()) {
            System.out.println("Basket is empty");
        } else {
            for (HashMap.Entry<String, Integer> entry: basket.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
