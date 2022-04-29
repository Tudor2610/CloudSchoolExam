package com.springexam.cloudschoolexam.exceptions;

public class OrderNotFoundException extends Exception{
    public OrderNotFoundException() {
        super("The order does not exist!");
    }
}
