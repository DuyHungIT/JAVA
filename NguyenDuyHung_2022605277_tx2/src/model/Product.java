/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author H
 */
public class Product {
     //
    public static final int PRODUCT_ID = 0;
    public static final String PRODUCT_NAME = "NO NAME";
    public static final float PRODUCT_PRICE = 0;
    public static final int PRODUCT_TOTAL = 0;
    //
    
    private int product_id;
    private String product_name;
    private float product_price;
    private int product_total;
    
    // ko tham so

    public Product() {
        
    }
    
    // co tham so
    public Product(int product_id, String product_name, float product_price, int product_total) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_total = product_total;
    }
    
    // getters and setter   

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public int getProduct_total() {
        return product_total;
    }

    public void setProduct_total(int product_total) {
        this.product_total = product_total;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name +
                ", product_price=" + product_price + ", product_total=" + product_total +
                '}';
    }
    
}
