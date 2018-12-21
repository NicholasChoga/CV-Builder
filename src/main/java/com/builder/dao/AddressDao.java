package com.builder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.builder.model.Address;


@Transactional
public interface AddressDao extends CrudRepository<Address, Long> {

}
