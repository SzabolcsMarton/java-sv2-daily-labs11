package day04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<WebshopItem> basket = new ArrayList<>();
    private int money;

    public User(String userName, int money) {
        this.userName = userName;
        this.money = money;
    }

    public void buyItem(WebshopItem webshopItem) {
            basket.add(webshopItem);
            money -= webshopItem.getPrice();

    }

    public String getUserName() {
        return userName;
    }

    public List<WebshopItem> getBasket() {
        return basket;
    }

    public int getMoney() {
        return money;
    }
}
