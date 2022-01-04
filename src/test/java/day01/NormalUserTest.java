package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    @Test
    public void createTest(){
        NormalUser normalUser = new NormalUser("h@g.hu","1234");
        assertEquals("h@g.hu",normalUser.getUserEmail());
        assertEquals("1234", normalUser.getPassword());
    }

}