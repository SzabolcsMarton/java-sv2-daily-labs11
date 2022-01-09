package day04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WebshopTest {

    List<User> users = Arrays.asList(
            new User("Sanyibacsi",100),
            new User("Pistabacsi",150)
    );

    List<WebshopItem> itemsForSell = Arrays.asList(
            new Product("Kalacs",20),
            new Product("NemKalacs", 25),
            new Service("Hajmosas", 30),
            new Service("nemhajmosos", 25)
    );

    @Test
    void buyItemWithNullUsernameShouldThrowException(){
        //Given
        Webshop webshop = new Webshop(users, itemsForSell);
        String name = null;
        String item = "kalacs";
        String expextedExceptionMessage = "User not found";

        //When
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> webshop.buyItem(name,item));

        //Then
        assertEquals(expextedExceptionMessage,exception.getMessage());
    }

    @Test
    void buyItemWithNullItemNameShouldThrowException(){
        //Given
        Webshop webshop = new Webshop(users, itemsForSell);
        String name = "Pistabacsi";
        String item = null;
        String expextedExceptionMessage = "Item not found";

        //When
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> webshop.buyItem(name,item));

        //Then
        assertEquals(expextedExceptionMessage,exception.getMessage());
    }

    @Test
    void buyItemWithNullItemNameShouldThrowException2(){
        //Given
        Webshop webshop = new Webshop(users, itemsForSell);
        String name = "Pistabacsi";
        String item = null;
        String expextedExceptionMessage = "Item not found";

        //When
        Exception exception = assertThrows(IllegalArgumentException.class,
                ()-> webshop.buyItem(name,item));

        //Then
        assertEquals(expextedExceptionMessage,exception.getMessage());
    }

}