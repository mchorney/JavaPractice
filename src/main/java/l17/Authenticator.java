package l17;

public class Authenticator {
    private String login;
    private String password;
    private int code;

    public Authenticator(String login, String password, int code) {
        this.login = login;
        this.password = password;
        this.code = code;
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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public String info() {
        return "Secret information: Login " + getLogin() + " password " + getPassword() + " code " + getCode();
    }
}
