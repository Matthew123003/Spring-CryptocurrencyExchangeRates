package com.zipcoder.cryptonator_api.controller;

import com.zipcoder.cryptonator_api.services.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by leon on 1/22/18.
 */
@RestController
public class FooController {
    @Autowired
    FooService fooService;

    public FooController(FooService fooService){
        this.fooService = fooService;
    }
}
