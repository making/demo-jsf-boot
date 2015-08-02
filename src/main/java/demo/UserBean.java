package demo;

import org.springframework.context.annotation.Scope;

import javax.inject.Named;
import java.io.Serializable;

@Named("user")
@Scope("session")
public class UserBean implements Serializable {
    private String name;
    private String password;

    public String getGreeting() {
        if (name == null || name.isEmpty()) return "";
        return "Welcome to JSF2 + Ajax, " + name + "!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
