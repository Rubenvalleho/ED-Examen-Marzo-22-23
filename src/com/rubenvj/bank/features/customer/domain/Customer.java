package com.rubenvj.bank.features.customer.domain;

public class Customer {
    //Atributos
    private final String dni;
    private final String name;
    private final String lastName;
    private final String direction;
    private final String town;
    private final String postalCode;

    //Constructor
    public Customer (String dni, String name, String lastName, String direction, String town, String postalCode) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.direction = direction;
        this.town = town;
        this.postalCode = postalCode;
    }

    //Metodos
    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDirection() {
        return direction;
    }

    public String getTown() {
        return town;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
