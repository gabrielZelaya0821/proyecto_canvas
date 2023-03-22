package modelos;

import java.io.Serializable;

/**
 *
 * @author gabri
 */
public class Usuario implements Serializable{
    
    protected String user;
    protected String password;
    protected String role;

    public Usuario() {
    }

    public Usuario(String user, String password, String role) {
        this.user = user;
        this.password = password;
        this.role = role;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return user + "|" + password + "|" + role;
    }
    
}
