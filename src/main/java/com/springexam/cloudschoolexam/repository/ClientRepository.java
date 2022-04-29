package com.springexam.cloudschoolexam.repository;

import com.springexam.cloudschoolexam.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
