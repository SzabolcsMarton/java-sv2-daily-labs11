package day04;

import java.time.LocalDate;
import java.util.List;

public class Webshop {
    private List<User> users;
    private List<WebshopItem> itemsToSell;

    public Webshop(List<User> users, List<WebshopItem> itemsToSell) {
        this.users = users;
        this.itemsToSell = itemsToSell;
    }

    public void buyItem(String userName, String itemName){
        User user = null;
        WebshopItem item = null;
        for (User actual : users){
            if(actual.getUserName().equals(userName)){
                user = actual;
                break;
            }
        }
        if(user == null)
            throw new IllegalArgumentException("User not found");

        for (WebshopItem actual : itemsToSell){
            if (actual.getName().equals(itemName)) {
                item = actual;
                break;
            }
        }
        if(item == null)
            throw new IllegalArgumentException("Item not found");

        if (user.getMoney() >= item.getPrice()) {
            WebshopItem itemCopy = item.copy();
            itemCopy.buy();
            if (user.getMoney() >= itemCopy.getPrice() * 3) {
                itemCopy.setPrice(itemCopy.getPrice() * 1.1);
                itemCopy.setExpirationDate(LocalDate.now().plusYears(3));
            }

            user.buyItem(item);
        }

    }

    public List<User> getUsers() {
        return users;
    }

    public List<WebshopItem> getItemsToSell() {
        return itemsToSell;
    }
}
