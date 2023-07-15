package com.example.app.SpringBootRestH2Employee.repository;


import com.example.app.SpringBootRestH2Employee.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {

    List<Client> findAll();
    Optional<Client> findById(int id);

    <S extends Client> S save(S client);

    void deleteById(int id);
}
