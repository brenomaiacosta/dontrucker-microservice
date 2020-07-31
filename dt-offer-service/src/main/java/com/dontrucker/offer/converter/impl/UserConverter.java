package com.dontrucker.offer.converter.impl;

import com.dontrucker.offer.converter.Converter;
import com.dontrucker.offer.domain.User;
import com.dontrucker.offer.dto.UserOfferDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserConverter implements Converter<User, UserOfferDTO> {
    @Override
    public User toObject(UserOfferDTO dto) {
        return new User(dto.getId(), dto.getAlias(), dto.getLatitude(), dto.getLongitude(), dto.getRating());
    }

    @Override
    public UserOfferDTO toDTO(User object) {
        return new UserOfferDTO(object.getId(), object.getAlias(), object.getLatitude(), object.getLongitude(), 0.0, object.getRating(), new ArrayList<>());
    }

    @Override
    public List<User> toObjectList(List<UserOfferDTO> dtoList) {
        List<User> objectList = new ArrayList<>();
        dtoList.stream().forEach(item -> {
            objectList.add(toObject(item));
        });
        return objectList;
    }

    @Override
    public List<UserOfferDTO> toDTOList(List<User> objectList) {
        List<UserOfferDTO> dtoList = new ArrayList<>();
        objectList.stream().forEach(item -> {
            dtoList.add(toDTO(item));
        });
        return dtoList;
    }
}
