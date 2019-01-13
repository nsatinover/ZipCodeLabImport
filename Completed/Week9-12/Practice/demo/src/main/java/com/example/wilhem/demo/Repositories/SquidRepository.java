package com.example.wilhem.demo.Repositories;

import com.example.wilhem.demo.Models.Squid;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "squids" , path = "squids")
public interface SquidRepository extends CrudRepository<Squid, Long> {



}
