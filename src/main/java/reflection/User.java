package reflection;

import java.time.LocalDate;

public class User extends Person implements Comparable{
    private String login;
    private LocalDate lastLoginDate;
    private boolean isActive;
    private String psw = "secret";

    public User(String name, int age) {
        super(name, age);
    }

    @Deprecated(forRemoval=true, since="2.0")
    public void purchase() {
        System.out.println("Куплено");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
