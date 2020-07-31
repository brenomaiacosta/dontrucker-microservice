package com.dontrucker.user.controller;

import com.dontrucker.user.domain.User;
import com.dontrucker.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public void create(@RequestBody User user) {
        userService.save(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/findall", method = RequestMethod.POST)
    public List<User> findAll() {
        return userService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/findByUsernameAndPassword", method = RequestMethod.POST)
    public User findByUsernameAndPassword(@RequestBody User user) {
        return userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }
}
