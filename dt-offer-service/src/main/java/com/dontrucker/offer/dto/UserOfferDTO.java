package com.dontrucker.offer.dto;

import com.dontrucker.offer.domain.OfferType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserOfferDTO {
    private String id;
    private String alias;
    private String latitude;
    private String longitude;
    private Double distance;
    private Double rating;
    private List<OfferType> offerTypeList;
}
