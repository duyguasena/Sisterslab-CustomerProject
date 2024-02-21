package com.sisterslab.sisterslabcustomer.service;

import com.sisterslab.sisterslabcustomer.model.Customer;
import com.sisterslab.sisterslabcustomer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j  //log basmamızı sağlar
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer){
        return  customerRepository.save(customer);

    }

    public List<Customer> allCustomer() {
        return customerRepository.findAll();
    }

    public Customer getCustomerFingById(Long id) {
        Optional<Customer> customer=customerRepository.findById(id);
        if(customer.isPresent()){
            return  customer.get();
        }else {
            log.info("Aradığınız id de kullanıcı yok!!");
            return  null;
        }
    }
}
