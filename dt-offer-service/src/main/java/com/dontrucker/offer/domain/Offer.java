package com.dontrucker.offer.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Offer {
    private String id;
    @DBRef
    private User user;
    @DBRef
    private OfferType offerType;
    @DBRef
    private List<OfferItem> offerItemList;
    private Integer amount;
}
