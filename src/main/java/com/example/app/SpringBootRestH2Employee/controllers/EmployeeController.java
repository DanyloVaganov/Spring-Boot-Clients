package com.example.app.SpringBootRestH2Employee.controllers;


import com.example.app.SpringBootRestH2Employee.entity.Client;
import com.example.app.SpringBootRestH2Employee.services.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/clients")
public class EmployeeController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    ClientService service;
    @GetMapping
    public List<Client> getAllClients() {
        LOGGER.info("MY_LOG: ClientController.getAllClients()");
        return service.getAllClients();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClient(@PathVariable("id") int id) {
        LOGGER.info("MY_LOG: ClientController.getClient(int id). ID: " + id);
        return service.getClientById(id);
    }

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        LOGGER.info("MY_LOG: ClientController.addClient(Client client). Add " +
               client.getLastName() + client.getFirstName() + ", " + client.getPhone());
        return service.saveOrUpdate(client);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        LOGGER.info("MY_LOG: ClientController.updateClient(Client client). Update " +
                client.getLastName() + client.getFirstName());
        return service.saveOrUpdate(client);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") int id) {
        LOGGER.info("MY_LOG: ClientController.deleteClient(int id). ID: " + id);
        service.deleteClientById(id);
    }
}
