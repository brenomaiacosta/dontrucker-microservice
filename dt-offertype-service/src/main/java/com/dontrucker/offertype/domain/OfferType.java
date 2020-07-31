package com.dontrucker.offertype.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@Document
public class OfferType {
    @Id
    @Field("_id")
    private String id;
    private String icon;
    private String name;
}
