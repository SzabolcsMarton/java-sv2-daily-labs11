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
        if (getMoney() >= webshopItem.getPrice()) {
            WebshopItem itemCopy = webshopItem.copy();
            basket.add(itemCopy);
            money -= itemCopy.getPrice();
            itemCopy.buy();
            if (getMoney() >= itemCopy.getPrice() * 3) {
                itemCopy.ExtendExpirationDate();
            }
        }
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
