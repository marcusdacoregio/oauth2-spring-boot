package com.marcusdacoregio.accountservice.service;

import com.marcusdacoregio.accountservice.client.AuthServiceFeignClient;
import com.marcusdacoregio.accountservice.dto.UserDto;
import com.marcusdacoregio.accountservice.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }
}
