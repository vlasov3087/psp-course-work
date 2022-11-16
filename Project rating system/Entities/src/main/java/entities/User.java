package entities;

import java.io.Serializable;

public class User implements Serializable {

    int id;
    private String login;
    private String password;
    private UserStatus status;
    private String fullName;
    private String organization;

    public User() {
        status = UserStatus.NOT_BANNED;
        login = "";
        password = "";
        fullName = "";
        organization = "";
    }

    public User(int id, String login, String password, UserStatus status, String fullName, String organization) {
        this();
        this.login = login;
        this.password = password;
        this.status = status;
        this.fullName = fullName;
        this.organization = organization;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (!login.equals(user.login)) return false;
        if (!password.equals(user.password)) return false;
        if (status != user.status) return false;
        if (!fullName.equals(user.fullName)) return false;
        return organization.equals(user.organization);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + fullName.hashCode();
        result = 31 * result + organization.hashCode();
        return result;
    }
}
