/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author H
 */
public class Computer extends Product{
      private float Ram_memory;
    private String Computer_brand;
    private float Fan_speed;
    
    // ko tham so

    public Computer() {
        super();
    }
    
    // co tham so

    public Computer(float Ram_memory, String Computer_brand, float Fan_speed) {
        this.Ram_memory = Ram_memory;
        this.Computer_brand = Computer_brand;
        this.Fan_speed = Fan_speed;
    }

    public Computer(float Ram_memory, String Computer_brand, float Fan_speed, int product_id, String product_name, float product_price, int product_total) {
        super(product_id, product_name, product_price, product_total);
        this.Ram_memory = Ram_memory;
        this.Computer_brand = Computer_brand;
        this.Fan_speed = Fan_speed;
    }
    
    // getters and setter

    public float getRam_memory() {
        return Ram_memory;
    }

    public void setRam_memory(float Ram_memory) {
        this.Ram_memory = Ram_memory;
    }

    public String getComputer_brand() {
        return Computer_brand;
    }

    public void setComputer_brand(String Computer_brand) {
        this.Computer_brand = Computer_brand;
    }

    public float getFan_speed() {
        return Fan_speed;
    }

    public void setFan_speed(float Fan_speed) {
        this.Fan_speed = Fan_speed;
    }
    
    
    // to string

    @Override
    public String toString() {
        return "Computer{" + "Ram_memory=" + Ram_memory + ", Computer_brand=" + Computer_brand + ", Fan_speed=" + Fan_speed + '}';
    }
    
}
