package com.zipcoder.cryptonator_api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Currency;

/**
 * Created by leon on 1/22/18.
 */
@Repository
public class FooRepository implements CrudRepository<Currency, Long> {
    @Override
    public <S extends Currency> S save(S s) {
        return null;
    }

    @Override
    public <S extends Currency> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Currency findOne(Long aLong) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Currency> findAll() {
        return null;
    }

    @Override
    public Iterable<Currency> findAll(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public void delete(Currency currency) {

    }

    @Override
    public void delete(Iterable<? extends Currency> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
