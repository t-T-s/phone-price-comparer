package PriceCompare.models;

import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.Set;

public class User {
    public String email;
    public String password;
    private boolean enabled;

    @DBRef
    private Set<Role> roles;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<String> getFavId() {
        return favId;
    }

    public void setFavId(ArrayList<String> favId) {
        this.favId = favId;
    }

    public ArrayList<String> favId = new ArrayList<String>();

    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
