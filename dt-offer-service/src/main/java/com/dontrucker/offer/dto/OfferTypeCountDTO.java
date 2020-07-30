package com.dontrucker.offer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OfferTypeCountDTO {
    private String offerTypeCode;
    private Integer count;
}
