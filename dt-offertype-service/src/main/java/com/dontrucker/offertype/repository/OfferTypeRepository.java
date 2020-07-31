package com.dontrucker.offertype.repository;

import com.dontrucker.offertype.domain.OfferType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferTypeRepository extends MongoRepository<OfferType, String> {
}
