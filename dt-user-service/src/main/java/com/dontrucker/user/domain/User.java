package com.dontrucker.user.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("last_name")
    private String lastName;
    private String alias;
    private String username;
    private String password;
    private String latitude;
    private String longitude;
    private Double rating;
}
