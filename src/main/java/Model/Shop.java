/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author k1626571
 */
public class Shop {
   
    private int shop_ID;
    private String name;
    private String address;
    private String postcode;
    private String manager;
    private static Shop instance;
    private Stock stock;

    public Shop(int shop_ID, String name, String address, String postcode, String manager) {
        this.shop_ID = shop_ID;
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.manager = manager;
        List<Product>products = new ArrayList<Product>();
        products.clear();
        Stock stock = new Stock(products);
    }

    public int getShop_ID() {
        return shop_ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getManager() {
        return manager;
    }

    public void setShop_ID(int shop_ID) {
        this.shop_ID = shop_ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
    
    public static Shop getIntance(){
        return instance;
    }

    public static Shop getInstance() {
        return instance;
    }

    public Stock getStock() {
        return stock;
    }

    public static void setInstance(Shop instance) {
        Shop.instance = instance;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
    
}
