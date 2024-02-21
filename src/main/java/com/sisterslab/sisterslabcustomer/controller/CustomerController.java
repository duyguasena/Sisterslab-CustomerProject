package com.sisterslab.sisterslabcustomer.controller;



import com.sisterslab.sisterslabcustomer.model.Customer;
import com.sisterslab.sisterslabcustomer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping()
    public Customer addCustomer(@RequestBody Customer customer){
        return  customerService.saveCustomer(customer);
    }

    @GetMapping()
    public List<Customer> allCustomer(){
        return customerService.allCustomer();
    }

    @GetMapping("{id}")
    public Customer getCustomerById(@PathVariable("id")Long id){
        return  customerService.getCustomerFingById(id);
    }



}
