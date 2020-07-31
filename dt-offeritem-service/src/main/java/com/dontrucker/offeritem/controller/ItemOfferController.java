package com.dontrucker.offeritem.controller;

import com.dontrucker.offeritem.model.ItemOffer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/itemoffer/")
public class ItemOfferController {
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "findall", method = RequestMethod.POST)
    public List<ItemOffer> findAll() {
        List<ItemOffer> itemOfferList = new ArrayList<>();
        itemOfferList.add(new ItemOffer("1", "Arroz"));
        itemOfferList.add(new ItemOffer("2", "Feijão"));
        itemOfferList.add(new ItemOffer("3", "Sabonete"));
        return itemOfferList;
    }
}
