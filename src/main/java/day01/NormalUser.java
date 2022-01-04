package day01;

public class NormalUser implements User{

    private String userEmail;
    private String passWord;

    public NormalUser(String userEmail, String passWord) {
        this.userEmail = userEmail;
        this.passWord = passWord;
    }

    @Override
    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public String getPassword() {
        return passWord;
    }
}
