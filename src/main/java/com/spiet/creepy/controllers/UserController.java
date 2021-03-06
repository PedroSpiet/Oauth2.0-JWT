package com.spiet.creepy.controllers;

import com.spiet.creepy.dtos.UsersDTO;
import com.spiet.creepy.resources.UsersResource;
import com.spiet.creepy.services.IUsersService;
import com.spiet.creepy.services.impl.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class UserController implements UsersResource {

    IUsersService userService;

    @Autowired
    public UserController(IUsersService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<?> create(UsersDTO userDTO) {
        return ResponseEntity.ok(userService.createUser(userDTO));
    }

    @Override
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("bla");
    }

}
