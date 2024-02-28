/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprojectoop;

/**
 *
 * @author Roba
 */
public class MainDish extends Menu {
    
    public String meat;
    public String vag;
    public String salad;

    public MainDish() {
    }

    public MainDish(String meat, String vag, String salad) {
        this.meat = meat;
        this.vag = vag;
        this.salad = salad;
    }

    
    public MainDish(int itemId, double total, String itemName) {
        super(itemId, total, itemName);
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getVag() {
        return vag;
    }

    public void setVag(String vag) {
        this.vag = vag;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    @Override
    public String toString() {
        return "MainDish{" + "meat=" + meat + ", vag=" + vag + ", salad=" + salad + '}';
    }
    
    
    
    
    
    
}
