package com.example.a19508751_lechison;

public class Product {
    private int id;
    private String name;
    private String ship;
    private String newPrice;
    private String oldPrice;

    public Product(int id, String name, String ship, String newPrice, String oldPrice) {
        this.id = id;
        this.name = name;
        this.ship = ship;
        this.newPrice = newPrice;
        this.oldPrice = oldPrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShip() {
        return ship;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }
}
