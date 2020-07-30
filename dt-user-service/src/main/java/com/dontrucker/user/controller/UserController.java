package com.dontrucker.user.controller;

import com.dontrucker.user.domain.User;
import com.dontrucker.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public void createTestData() {
        User user = new User();
        user.setName("Jhordan");
        user.setLastName("Ortolani");
        userService.save(user);

        user.setName("Breno");
        user.setLastName("Maia");
        userService.save(user);

        user.setName("Taiane");
        user.setLastName("Leal");
        userService.save(user);

        user.setName("Henrique");
        user.setLastName("Basoni");
        userService.save(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/find-all", method = RequestMethod.POST)
    public List<User> findAll() {
        return userService.findAll();
    }
}
