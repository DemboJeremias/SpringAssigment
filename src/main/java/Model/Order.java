/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author k1626571
 */

public class Order {
    //variables
    private float total_price;
    private List<Product> products = new ArrayList<Product>();
    private Shop shop;
    private Date delivery_date;
// construtor
    public Order( Shop shop, Date delivery_date, List<Product> products) {
        this.products = products;
        this.shop = shop;
        this.delivery_date = delivery_date;
        this.total_price = calTotal();
    }
    // for loop which calculate the total price based on order item and list
    private float calTotal (){
        float total = 0;
        
        for(Product product : products){
           total =+ product.getPrice();
        }
        
        return total;
    }

    public float getTotal_price() {
        return total_price;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Shop getShop() {
        return shop;
    }

    public Date getDelivery_date() {
        return delivery_date;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void setDelivery_date(Date delivery_date) {
        this.delivery_date = delivery_date;
    }
    
}
