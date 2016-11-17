package com.tegess.security;

import java.util.List;

public class User {

    private final String username;
    private final List<String> privileges;

    public User(String username, List<String> privileges) {
        this.username = username;
        this.privileges = privileges;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getPrivileges() {
        return privileges;
    }

}
