package day04;

import java.time.LocalDate;

public interface WebshopItem {
    String getName();
    double getPrice();
    LocalDate getExpirationDate();

    WebshopItem copy();
    void buy();
    void setPrice(double newPrice);
    void setExpirationDate(LocalDate newDate);
    void ExtendExpirationDate();
}
