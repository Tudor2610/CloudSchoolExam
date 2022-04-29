package com.springexam.cloudschoolexam.exceptions;

public class ClientDoesNotExistException extends Exception{
    public ClientDoesNotExistException() {
        super("Client does not exist!");
    }
}
