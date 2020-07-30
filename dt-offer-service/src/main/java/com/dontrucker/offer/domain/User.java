package com.dontrucker.offer.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
public class User {
    @Id
    @Field("_id")
    private String id;
    private String name;
    private String lastName;
    private String alias;
    private String latitude;
    private String longitude;
    private Integer rating;
}
