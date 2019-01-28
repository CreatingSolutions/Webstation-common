package webstationcommon;

import java.util.ArrayList;
import java.util.Collection;

public class User {

    private String emailAddress;

    private String password;

    private Token token;

    private Cart cart;

    private Collection<Role> roles = new ArrayList<Role>() {
        private static final long serialVersionUID = -3328919039745373393L;
        { add(Role.ROLE_USER); }
    };

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Collection<Role> getRoles() { return roles; }
    public void setRoles(Collection<Role> roles) { this.roles = roles; }
}
