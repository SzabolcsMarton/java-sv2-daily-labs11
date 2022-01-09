package day04;

import java.time.LocalDate;

public class Product implements WebshopItem{

    private String name;
    private double price;
    private LocalDate expirationDate;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public LocalDate getExpirationDate() {
        return null;
    }

    @Override
    public WebshopItem copy() {
        return new Product(name, price);
    }

    @Override
    public void buy() {
        this.expirationDate = LocalDate.now().plusMonths(3);
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;

    }

    @Override
    public void setExpirationDate(LocalDate newDate) {
        this.expirationDate = newDate;
    }
}
