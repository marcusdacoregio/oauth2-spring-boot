package com.marcusdacoregio.authservice.dto;

import com.marcusdacoregio.authservice.enums.Authorities;

import java.util.List;

public class UserDto {

    private String id;

    private String username;

    private List<Authorities> authorities;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authorities> authorities) {
        this.authorities = authorities;
    }
}
