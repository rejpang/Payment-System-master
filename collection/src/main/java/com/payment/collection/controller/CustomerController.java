package com.payment.collection.controller;

import com.payment.collection.model.Customer;
import com.payment.collection.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({"/customer"})
public class CustomerController implements DefaultController<Customer, Long> {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping({""})
    @Override
    public ResponseEntity getAll() {
        return new ResponseEntity(customerService.getAll(), HttpStatus.ACCEPTED);
    }

    @PostMapping({"/add"})
    @Override
    public ResponseEntity add(@RequestBody Customer customer) {
        customerService.save(customer);
        return new ResponseEntity(customerService.getAll(), HttpStatus.ACCEPTED);
    }

    @PutMapping({"/update"})
    @Override
    public ResponseEntity update(@RequestBody Customer liability) {
        customerService.save(liability);
        return new ResponseEntity(customerService.getAll(), HttpStatus.ACCEPTED);
    }

    @DeleteMapping({"/delete"})
    @Override
    public ResponseEntity delete(@RequestBody Long id) {
        customerService.delete(id);
        return new ResponseEntity(customerService.getAll(), HttpStatus.ACCEPTED);
    }
}
