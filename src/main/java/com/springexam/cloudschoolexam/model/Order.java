package com.springexam.cloudschoolexam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name = "orders")
@AllArgsConstructor
@RequiredArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    private Client client;

    @OneToOne
    private Pizza pizza;
}
