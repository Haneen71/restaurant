/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprojectoop;

/**
 *
 * @author Roba
 */
public abstract class Menu {
    
    private int itemId;
    private double total;
    private String itemName;

    public Menu() {//ovaerloading
    }

    public Menu(int itemId, double total, String itemName) {//overloading
        this.itemId = itemId;
        this.total = total;
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    

    @Override
    public String toString() {
        return  itemId +  "-" + itemName + " = " + total + "SR";
    }
    
        
}
