/*
 * File: User.java
 * Project: user
 * Created: Monday, February 7th 2022, 5:19:52 pm
 * Last Modified: Monday, February 7th 2022, 5:38:42 pm
 * Copyright © 2022 AMDE Agência
 */

package br.com.raloliver.sbshop.domain.user;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@MappedSuperclass
public class User implements Serializable {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;
    private String name;
    private String phone;
    private String email;
    private String password;

}
