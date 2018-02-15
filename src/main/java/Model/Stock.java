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
public class Stock {
    
    private List<Product> stock = new ArrayList<Product>();

    public Stock(List<Product> products) {
        this.stock = products;
    }

    public List<Product> getStock() {
        return stock;
    }

    public void setStock(List<Product> stock) {
        this.stock = stock;
    }
    
}
