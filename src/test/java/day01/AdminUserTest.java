package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    public void createAdminTest(){
        AdminUser adminUser = new AdminUser("h@g.hu", "1234");
        assertEquals("h@g.hu", adminUser.getUserEmail());
        assertEquals("****", adminUser.getPassword());
    }

}