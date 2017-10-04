package com.odecee.springmongo.demo.controllers;

import com.odecee.springmongo.demo.domain.Customer;
import com.odecee.springmongo.demo.persistence.MongoConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    MongoConnector customerRepository;

    @RequestMapping("/helloworld")
    String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/createcustomer")
    String createMongoCustomer() {
        Customer savedCustomer = customerRepository.save(new Customer("Alice", "Smith"));
        return "Much success "  + savedCustomer;
    }


}
