package com.springexam.cloudschoolexam.exceptions;

public class PizzaDoesNotExistException extends Exception{
    public PizzaDoesNotExistException() {
        super("The pizza you requested is not available in the menu!");
    }
}
