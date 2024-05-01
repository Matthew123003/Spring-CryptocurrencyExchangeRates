package com.zipcoder.cryptonator_api.domain;

import com.sun.tools.javac.code.Attribute;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by leon on 1/22/18.
 */
//THIS IS JUST A GENERAL SETUP, DEPENDING ON WHAT MAPPING ACTIONS ARE ALLOWED BY THE OUTSIDE API
//THAT DEPENDS ON WHICH MAPPING ACTIONS WOULD WORK. YOU CAN FIND OUT WHAT MAPPING ACTIONS ARE ALLOWED
//ON THE API BY USING POSTMAN AND EXECUTING AN OPTIONS REQUEST, AT VERY LEAST THE GETMAPPING
//SHOULD WORK. GOING TO COME BACK LATER AND ADJUST DATATYPES FOR A DIFFERENT OUTSIDE API
@Entity
public class Crypto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public enum CryptoType {
        BITCOIN,
        ETHEREUM,
        DOGECOIN,
//        THIS IS HOW I WOULD CREATE INSTANCES OF MY CRYPTO CLASS AND SET THE CRYPTO TYPE USING ENUMS
//        Crypto bitcoin = new Crypto(Crypto.CryptoType.BITCOIN);
//        bitcoin.setType(Crypto.CryptoType.BITCOIN);
//        Crypto ethereum = new Crypto(Crypto.CryptoType.ETHEREUM);
//        ethereum.setType(Crypto.CryptoType.ETHEREUM);
//        Crypto dogecoin = new Crypto(Crypto.CryptoType.DOGECOIN);
//        ethereum.setType(Crypto.CryptoType.DOGECOIN;
    }

    private CryptoType type;

    private Double value;

    public Crypto() {
    }

    public Crypto(Long id, CryptoType type, Double value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CryptoType getType() {
        return type;
    }

    public void setType(CryptoType type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
