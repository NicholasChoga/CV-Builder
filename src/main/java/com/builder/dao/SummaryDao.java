package com.builder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.builder.model.Summary;


@Transactional
public interface SummaryDao extends CrudRepository<Summary, Long> {

}
