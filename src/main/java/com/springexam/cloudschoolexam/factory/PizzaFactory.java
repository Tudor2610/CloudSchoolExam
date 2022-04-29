package com.springexam.cloudschoolexam.factory;

import com.springexam.cloudschoolexam.exceptions.PizzaDoesNotExistException;
import com.springexam.cloudschoolexam.model.*;

public class PizzaFactory {
    public Pizza createPizza (String pizzaType) throws PizzaDoesNotExistException {
        return switch (pizzaType) {
            case "Margherita" -> new PizzaMargherita();
            case "Prosciutto" -> new PizzaProsciuttoEFunghi();
            case "Diavola" -> new PizzaDiavola();
            case "Quattro" -> new PizzaQuattroStagioni();
            default -> throw new PizzaDoesNotExistException();
        };
    }
}
