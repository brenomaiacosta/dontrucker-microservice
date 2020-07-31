package com.dontrucker.offer.service;

import com.dontrucker.offer.converter.impl.UserConverter;
import com.dontrucker.offer.domain.OfferType;
import com.dontrucker.offer.dto.UserOfferDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserOfferDTOService {
    @Autowired
    private UserService userService;
    @Autowired
    private UserConverter userConverter;

    private Random random = new Random();
    private int low = 6;
    private int high = 60;

    public List<UserOfferDTO> findAll(String latitude, String longitude) {
        List<UserOfferDTO> userOfferDTOList =  userConverter.toDTOList(userService.findAll());
        userOfferDTOList.stream().forEach(item -> {
            List<OfferType> offerTypeDTOList = new ArrayList<>();
            offerTypeDTOList.add(new OfferType("1", "mug-hot", "Café"));
            offerTypeDTOList.add(new OfferType("2","hamburger", "Hamburger"));
            offerTypeDTOList.add(new OfferType("3","apple-alt", "Ftruta"));
            item.setOfferTypeList(offerTypeDTOList);
            item.setDistance(Double.valueOf(random.nextInt(high - low) + low));
        });
        return userOfferDTOList;
    }
}
