/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprojectoop;

/**
 *
 * @author Roba
 */
public class Customer {
    
    private String Name;
    private long Number;
    private Sweet sweet;
    private MainDish maindish;
    private Date date;
    private int numOfP;
    private boolean RDivider;

    public Customer() {//overloading
        Name="";
        Number=0;
        sweet=new Sweet();
        maindish=new MainDish();
        date=new Date();
        numOfP=0;
        RDivider=false;
    }

    public Customer(String Name, long Number) {
        this.Name = Name;
        this.Number = Number;
    }

    
    public Customer(String Name, long Number, int numOfP) {//overloading
        this.Name = Name;
        this.Number = Number;
        this.numOfP=numOfP;
    }

    public Customer(String Name, long Number, Sweet sweet, MainDish maindish, Date date, int numOfP) {
        this.Name = Name;
        this.Number = Number;
        this.sweet = sweet;
        this.maindish = maindish;
        this.date = date;
        this.numOfP = numOfP;
    }

   

    public Customer(String Name, long Number, Sweet sweet, MainDish maindish, Date date, int numOfP, boolean RDivider) {
        this.Name = Name;
        this.Number = Number;
        this.sweet = sweet;
        this.maindish = maindish;
        this.date = date;
        this.numOfP = numOfP;
        this.RDivider = RDivider;
    }

  
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public long getNumber() {
        return Number;
    }

    public void setNumber(long Number) {
        this.Number = Number;
    }
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumOfP() {
        return numOfP;
    }

    public void setNumOfP(int numOfP) {
        this.numOfP = numOfP;
    }

    public boolean isRDivider() {
        return RDivider;
    }

    public void setRDivider(boolean RDivider) {
        this.RDivider = RDivider;
    }

    public Sweet getSweet() {
        return sweet;
    }

    public void setSweet(Sweet sweet) {
        this.sweet = sweet;
    }

    public MainDish getMaindish() {
        return maindish;
    }

    public void setMaindish(MainDish maindish) {
        this.maindish = maindish;
    }
    
    
    public Customer Clone(){
        return new Customer (this.getName(),this.getNumber(),this.getSweet(),this.getMaindish(),this.getDate(),this.getNumOfP(),this.isRDivider());
    }

 
   
   
    
    @Override
    public String toString() {
        return  Name + " - " + Number +  " - " + date + " -  " + numOfP + "  - ( " + RDivider + ')';
    }
    
    
    
}
