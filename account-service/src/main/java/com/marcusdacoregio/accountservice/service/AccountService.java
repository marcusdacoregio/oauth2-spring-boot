package com.marcusdacoregio.accountservice.service;

import com.marcusdacoregio.accountservice.dto.UserDto;
import com.marcusdacoregio.accountservice.dto.UserRegistrationDto;

public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}
