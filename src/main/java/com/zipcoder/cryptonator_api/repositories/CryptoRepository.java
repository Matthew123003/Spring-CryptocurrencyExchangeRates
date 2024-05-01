package com.zipcoder.cryptonator_api.repositories;

import com.zipcoder.cryptonator_api.domain.Crypto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by leon on 1/22/18.
 */
@Repository
public interface CryptoRepository extends CrudRepository<Crypto, Long> {
    //THIS IS JUST A GENERAL SETUP, DEPENDING ON WHAT MAPPING ACTIONS ARE ALLOWED BY THE OUTSIDE API
    //THAT DEPENDS ON WHICH MAPPING ACTIONS WOULD WORK. YOU CAN FIND OUT WHAT MAPPING ACTIONS ARE ALLOWED
    //ON THE API BY USING POSTMAN AND EXECUTING AN OPTIONS REQUEST, AT VERY LEAST THE GETMAPPING
    //SHOULD WORK. GOING TO COME BACK LATER AND ADJUST DATATYPES FOR A DIFFERENT OUTSIDE API
}
