/*
 * File: CustomerService.java
 * Project: application
 * Created: Monday, May 2nd 2022, 3:54:03 pm
 * Last Modified: Monday, May 2nd 2022, 3:57:33 pm
 * Copyright © 2022 AMDE Agência
 */

package br.com.raloliver.sbshop.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.raloliver.sbshop.domain.customer.Customer;
import br.com.raloliver.sbshop.domain.customer.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

}
