package com.dontrucker.offer.controller;

import com.dontrucker.offer.dto.UserOfferDTO;
import com.dontrucker.offer.service.UserOfferDTOService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/useroffer/")
public class UserOfferController {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private UserOfferDTOService userOfferDTOService;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/getbycoordinates")
    public List<UserOfferDTO> getOfferByCoordinates(@RequestBody String jsonCoordnates) throws JsonProcessingException {
        JsonNode coordinates = objectMapper.readTree(jsonCoordnates);
        return userOfferDTOService.findAll(coordinates.get("latitude").asText(), coordinates.get("longitude").asText());
    }
}
