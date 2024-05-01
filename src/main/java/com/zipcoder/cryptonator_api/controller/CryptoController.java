package com.zipcoder.cryptonator_api.controller;

import com.zipcoder.cryptonator_api.domain.Crypto;
import com.zipcoder.cryptonator_api.services.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by leon on 1/22/18.
 */
@RestController
public class CryptoController {

    private CryptoService service;
    @Autowired//Setup for using outside API/Servlet, must autowire constructor and not field
    public CryptoController(CryptoService service) {
        this.service = service;
    }

    //THIS IS JUST A GENERAL SETUP, DEPENDING ON WHAT MAPPING ACTIONS ARE ALLOWED BY THE OUTSIDE API
    //THAT DEPENDS ON WHICH MAPPING ACTIONS WOULD WORK. YOU CAN FIND OUT WHAT MAPPING ACTIONS ARE ALLOWED
    //ON THE API BY USING POSTMAN AND EXECUTING AN OPTIONS REQUEST, AT VERY LEAST THE GETMAPPING
    //SHOULD WORK.

    @GetMapping("/cryptos")
    public ResponseEntity<Iterable<Crypto>> index() {

        return new ResponseEntity<>(service.index(), HttpStatus.OK);
    }
    @GetMapping("/crypto/{id}")
    public ResponseEntity<Crypto> show(@PathVariable Long id) {

        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
    }
    @PostMapping("/cryptos")
    public ResponseEntity<Crypto> create(@RequestBody Crypto crypto) {
        return new ResponseEntity<>(service.create(crypto), HttpStatus.CREATED);
    }
    @PutMapping("/crypto/{id}")
    public ResponseEntity<Crypto> update(@PathVariable Long id, @RequestBody Crypto crypto) {
        return new ResponseEntity<>(service.update(id, crypto), HttpStatus.OK);
    }
    @DeleteMapping("/crypto/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}
