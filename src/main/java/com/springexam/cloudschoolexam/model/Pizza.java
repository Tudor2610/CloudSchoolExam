package com.springexam.cloudschoolexam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Pizza {
    @Id
    @GeneratedValue
    private Integer id;

    private String pizzaType;

    @OneToOne
    private Order order;

}
