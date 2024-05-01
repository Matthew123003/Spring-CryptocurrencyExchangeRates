package com.zipcoder.cryptonator_api.services;

import com.zipcoder.cryptonator_api.domain.Crypto;
import com.zipcoder.cryptonator_api.repositories.CryptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by leon on 1/22/18.
 */
@Service
public class CryptoService {

    private CryptoRepository repository;
    @Autowired//Setup for using outside API/Servlet, must autowire constructor and not field
    public CryptoService(CryptoRepository repository) {
        this.repository = repository;
    }

    //THIS IS JUST A GENERAL SETUP, DEPENDING ON WHAT MAPPING ACTIONS ARE ALLOWED BY THE OUTSIDE API
    //THAT DEPENDS ON WHICH MAPPING ACTIONS WOULD WORK. YOU CAN FIND OUT WHAT MAPPING ACTIONS ARE ALLOWED
    //ON THE API BY USING POSTMAN AND EXECUTING AN OPTIONS REQUEST, AT VERY LEAST THE GETMAPPING
    //SHOULD WORK. GOING TO COME BACK LATER AND ADJUST DATATYPES FOR A DIFFERENT OUTSIDE API

    public Iterable<Crypto> index() {
        return repository.findAll();
    }

    public Crypto show(Long id) {
        return repository.findOne(id);
    }

    public Crypto create(Crypto baker) {
        return repository.save(baker);
    }

    public Crypto update(Long id, Crypto newCryptoData) {
        Crypto originalCrypto = repository.findOne(id);
        originalCrypto.setType(newCryptoData.getType());
        originalCrypto.setValue(newCryptoData.getValue());
        return repository.save(originalCrypto);
    }

    public Boolean delete(Long id) {
        repository.delete(id);
        return true;
    }
}
