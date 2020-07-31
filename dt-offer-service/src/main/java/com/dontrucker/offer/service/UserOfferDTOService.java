package com.dontrucker.offer.service;

import com.dontrucker.offer.converter.impl.UserConverter;
import com.dontrucker.offer.dto.OfferTypeCountDTO;
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
            List<OfferTypeCountDTO> offerTypeCountDTOList = new ArrayList<>();
            offerTypeCountDTOList.add(new OfferTypeCountDTO("1", "mug-hot"));
            offerTypeCountDTOList.add(new OfferTypeCountDTO("2","hamburger"));
            offerTypeCountDTOList.add(new OfferTypeCountDTO("3","apple-alt"));
            item.setOfferTypeCountList(offerTypeCountDTOList);
            item.setDistance(Double.valueOf(random.nextInt(high - low) + low));
        });
        return userOfferDTOList;
    }
}
