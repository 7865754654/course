package reflection;

import java.time.LocalDate;

public class User {
    protected String fullName;
    protected int age;
    protected String login;
    protected LocalDate lastLoginDate;
    protected boolean isActive;
    protected String psw = "secret";

    public User(String fullName, int age, String login, LocalDate lastLoginDate, boolean isActive, String psw) {
        this.fullName = fullName;
        this.age = age;
        this.login = login;
        this.lastLoginDate = lastLoginDate;
        this.isActive = isActive;
        this.psw = psw;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", lastLoginDate=" + lastLoginDate +
                ", isActive=" + isActive +
                ", psw='" + psw + '\'' +
                '}';
    }
}
