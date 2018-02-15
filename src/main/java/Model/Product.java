/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author k1626571
 */
public class Product {
    
    private int prod_ID;
    private String name;
    private String description;
    private float price;
    private int net_weight;
    private int amount;
    private static Product instance;

    public Product(int ID, String name, String description, float price, int net_weight) {
        this.prod_ID = ID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.net_weight = net_weight;
        this.amount = 0;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public int getNet_weight() {
        return net_weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setNet_weight(int net_weight) {
        this.net_weight = net_weight;
    }

    // added for itteration 2
    public int getProd_ID() {
        return prod_ID;
    }

    public void setProd_ID(int prod_ID) {
        this.prod_ID = prod_ID;
    }

    public int getAmount() {
        return amount;
    }

    public static Product getInstance() {
        return instance;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static void setInstance(Product instance) {
        Product.instance = instance;
    }
}
