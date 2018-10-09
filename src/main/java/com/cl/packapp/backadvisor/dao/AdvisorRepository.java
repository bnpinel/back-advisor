package com.cl.packapp.backadvisor.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cl.packapp.backadvisor.model.Advisor;

public interface AdvisorRepository extends MongoRepository<Advisor, String> {

}
