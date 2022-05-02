/*
 * File: LoginController.java
 * Project: controller
 * Created: Monday, February 7th 2022, 5:00:10 pm
 * Last Modified: Wednesday, February 16th 2022, 1:31:00 pm
 * Copyright © 2022 AMDE Agência
 */

package br.com.raloliver.sbshop.infrastructure.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping(path = { "/login", "/" })
    public String login() {
        return "login";
    }
}
