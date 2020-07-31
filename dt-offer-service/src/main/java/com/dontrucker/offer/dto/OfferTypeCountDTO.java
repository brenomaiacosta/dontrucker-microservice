package com.dontrucker.offer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OfferTypeCountDTO {
    private String id;
    @JsonProperty("icon")
    private String offerTypeIcon;
}
