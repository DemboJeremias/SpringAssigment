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
    
    public void addStock(Product product){
        stock.add(product);
    }
    
    public void addStock(List<Product> products){
        stock.addAll(stock);
    }
    
    public void updateQuantity(Product product, int quantity){
        product.setAmount(quantity);
    }
}
