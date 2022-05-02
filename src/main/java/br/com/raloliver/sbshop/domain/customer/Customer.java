/*
 * File: Customer.java
 * Project: customer
 * Created: Monday, February 7th 2022, 5:29:41 pm
 * Last Modified: Monday, February 7th 2022, 5:40:01 pm
 * Copyright © 2022 AMDE Agência
 */

package br.com.raloliver.sbshop.domain.customer;

import javax.persistence.Entity;

import br.com.raloliver.sbshop.domain.user.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Entity
public class Customer extends User {

    private String cpf;
    private String zipcode;

}
