package day04;

import java.time.LocalDate;

public class Service implements WebshopItem{
    private String name;
    private double price;
    private LocalDate expirationDate;

    public Service(String name, double price, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
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
        return expirationDate;
    }

    @Override
    public WebshopItem copy() {
        return new Service(name,price,expirationDate);
    }

    @Override
    public void buy() {
    this.expirationDate = LocalDate.now().plusYears(1);
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
