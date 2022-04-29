package com.springexam.cloudschoolexam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @OneToOne
    private Order order;

}
