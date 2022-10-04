package com.payment.collection.service;

import com.payment.collection.controller.exception.NoTransactionFoundError;
import com.payment.collection.model.Customer;
import com.payment.collection.repo.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        try {
//            Customer customer1 = find(customer.getCustomerId());
//            customer1.setName(customer.getName());

            customerRepository.save(customer);
        } catch (RuntimeException e) {
            throw new NoTransactionFoundError();
        }
    }

    @Override
    public void delete(Long id) {
        try {
            customerRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new NoTransactionFoundError();
        }
    }

    @Override
    public Customer find(Long id) {
        try {
            return customerRepository.findById(id).get();
        } catch (RuntimeException e) {
            throw new NoTransactionFoundError();
        }
    }
}
