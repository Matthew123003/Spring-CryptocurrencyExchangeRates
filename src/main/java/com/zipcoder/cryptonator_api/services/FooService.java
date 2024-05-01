package com.zipcoder.cryptonator_api.services;

import com.zipcoder.cryptonator_api.repositories.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by leon on 1/22/18.
 */
@Service
public class FooService {
    @Autowired
    FooRepository fooRepository;

    public FooService(FooRepository fooRepository){
        this.fooRepository = fooRepository;
    }
}
