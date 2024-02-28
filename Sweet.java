/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprojectoop;

/**
 *
 * @author Roba
 */
public class Sweet extends Menu{
    
    public String coffee;
    public String icecream;
    public String pancake;

    public Sweet() {
    }

    public Sweet(String coffee, String icecream, String pancake) {
        this.coffee = coffee;
        this.icecream = icecream;
        this.pancake = pancake;
    }

    public Sweet(int itemId, double total, String itemName) {
        super(itemId, total, itemName);
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public String getIcecream() {
        return icecream;
    }

    public void setIcecream(String icecream) {
        this.icecream = icecream;
    }

    public String getPancake() {
        return pancake;
    }

    public void setPancake(String pancake) {
        this.pancake = pancake;
    }

    @Override
    public String toString() {
        return "Sweet{" + "coffee=" + coffee + ", icecream=" + icecream + ", pancake=" + pancake + '}';
    }
    
    
}
