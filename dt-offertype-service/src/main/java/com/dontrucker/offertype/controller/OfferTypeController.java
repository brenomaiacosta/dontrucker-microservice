package com.dontrucker.offertype.controller;

import com.dontrucker.offertype.domain.OfferType;
import com.dontrucker.offertype.service.OfferTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/offertype/")
public class OfferTypeController {
    @Autowired
    private OfferTypeService offerTypeService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/findall", method = RequestMethod.POST)
    public List<OfferType> findAll() {
        return offerTypeService.findAll();
    }
}
