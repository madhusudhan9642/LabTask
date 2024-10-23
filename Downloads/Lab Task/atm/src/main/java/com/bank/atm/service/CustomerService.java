package com.bank.atm.service;

import com.bank.atm.model.Customers;
import com.bank.atm.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomersRepository customerRepository;


    public long getUniqueCustomersInLast24Hours() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR, -24);
        Date timestamp = calendar.getTime();

        return customerRepository.countUniqueCustomersByTimestamp(timestamp);
    }

}

