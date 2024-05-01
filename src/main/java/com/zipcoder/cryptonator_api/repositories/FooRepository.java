package com.zipcoder.cryptonator_api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Currency;

/**
 * Created by leon on 1/22/18.
 */
@Repository
public interface FooRepository extends CrudRepository<Currency, Long> {

}
