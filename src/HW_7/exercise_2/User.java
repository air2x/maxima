package HW_7.exercise_2;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password, Basket basket) {
        setLogin(login);
        setPassword(password);
        setBasket(basket);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return getLogin() + ", " + getPassword() + ", " + getBasket();
    }
}
