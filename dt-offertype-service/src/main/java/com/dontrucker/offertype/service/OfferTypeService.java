package com.dontrucker.offertype.service;

import com.dontrucker.offertype.domain.OfferType;
import com.dontrucker.offertype.repository.OfferTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferTypeService {
    @Autowired
    private OfferTypeRepository offerTypeRepository;

    public List<OfferType> findAll() {
        return offerTypeRepository.findAll();
    }
}
