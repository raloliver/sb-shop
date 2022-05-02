/*
 * File: CustomerRepository.java
 * Project: customer
 * Created: Monday, May 2nd 2022, 3:50:39 pm
 * Last Modified: Monday, May 2nd 2022, 4:07:57 pm
 * Copyright © 2022 AMDE Agência
 */

package br.com.raloliver.sbshop.domain.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
