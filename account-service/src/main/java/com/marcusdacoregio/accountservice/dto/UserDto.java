package com.marcusdacoregio.accountservice.dto;

import org.springframework.security.core.GrantedAuthority;

import java.util.List;

public class UserDto {

    private String id;

    private String username;

    private List<GrantedAuthority> authorities;

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

    public List<GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }
}
