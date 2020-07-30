package com.dontrucker.offer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String id;
    private String alias;
    private String rating;
    private String latitude;
    private String longitude;
    private List<OfferTypeCountDTO> offerTypeCountList;
}
