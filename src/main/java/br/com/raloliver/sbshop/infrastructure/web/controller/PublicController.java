/*
 * File: PublicController.java
 * Project: controller
 * Created: Wednesday, February 16th 2022, 1:29:02 pm
 * Last Modified: Wednesday, February 16th 2022, 3:04:10 pm
 * Copyright © 2022 AMDE Agência
 */

package br.com.raloliver.sbshop.infrastructure.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.raloliver.sbshop.domain.customer.Customer;

@Controller
@RequestMapping(path = "/public")
public class PublicController {

    @GetMapping("/customer/new")
    public String createCustomer(Model model) {

        model.addAttribute("customer", new Customer());

        return "register-customer";
    }

}
