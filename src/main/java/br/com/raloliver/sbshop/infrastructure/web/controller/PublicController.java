/*
 * File: PublicController.java
 * Project: controller
 * Created: Wednesday, February 16th 2022, 1:29:02 pm
 * Last Modified: Monday, May 2nd 2022, 4:02:34 pm
 * Copyright © 2022 AMDE Agência
 */

package br.com.raloliver.sbshop.infrastructure.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.raloliver.sbshop.application.CustomerService;
import br.com.raloliver.sbshop.domain.customer.Customer;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping(path = "/public")
public class PublicController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer/new")
    public String createCustomer(Model model) {

        model.addAttribute("customer", new Customer());

        return "register-customer";
    }

    @PostMapping(value = "/customer/save")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);

        return "register-customer";
    }

}
