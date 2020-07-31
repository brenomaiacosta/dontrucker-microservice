package com.dontrucker.offer.service;

import com.dontrucker.offer.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("1", "Breno", "Maia", "Mc.Breno´s", "1.111111", "2.222222", 4.5));
        userList.add(new User("1", "Henrique", "Basoni", "Basoni Food", "1.111111", "2.222222", 1.5));
        userList.add(new User("1", "Jhordan", "Ortolani", "Ortolight Mercado", "1.111111", "2.222222", 3.5));
        userList.add(new User("1", "Thayane", "Leal", "Thayane Leal", "1.111111", "2.222222", 5.0));
        userList.add(new User("1", "Carlos", "César", "Carlinhos Lanche", "1.111111", "2.222222", 4.0));
        userList.add(new User("1", "Tatiane", "Bonjiovani", "Restaurante Bonjiovani", "1.111111", "2.222222", 2.5));
        userList.add(new User("1", "Romulo", "Costa", "Queijo Mineiro Bar e Restaurante", "1.111111", "2.222222", 4.5));
        userList.add(new User("1", "Rodrigo", "Braga", "Pizzaria BR 259", "1.111111", "2.222222", 5.0));
        userList.add(new User("1", "Ana Paula", "Rigamonte", "Ana Paula", "1.111111", "2.222222", 3.5));
        return userList;
    }
}
