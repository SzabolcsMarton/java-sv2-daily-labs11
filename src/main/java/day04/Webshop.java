package day04;

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

        user.buyItem(item);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<WebshopItem> getItemsToSell() {
        return itemsToSell;
    }
}
