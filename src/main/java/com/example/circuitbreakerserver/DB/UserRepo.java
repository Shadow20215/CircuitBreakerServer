package com.example.circuitbreakerserver.DB;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<Users, Long> {}
