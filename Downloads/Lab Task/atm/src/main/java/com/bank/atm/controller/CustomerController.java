package com.bank.atm.controller;

import com.bank.atm.model.Customers;
import com.bank.atm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/atm")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customers/count")
    public long getTotalCustomersInLast24Hours() {
        return customerService.getUniqueCustomersInLast24Hours();
    }


}

