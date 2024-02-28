/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testprojectoop;

/**
 *
 * @author Roba
 */
public class Reservation extends Customer {
    
    public Customer[] applicationDetails;
    public static int numOfReservation=0;

    public Reservation() {
    applicationDetails = new Customer[10];
    }

    

    public Customer[] getApplicationDetails() {
        return applicationDetails;
    }

    public void setApplicationDetails(Customer[] applicationDetails) {
        this.applicationDetails = applicationDetails;
    }
    
    public void  addReservation(Customer c){
        applicationDetails[numOfReservation]=c;
        numOfReservation++;
    }
    
    
    public void displayReservation(int i){
    System.out.println(applicationDetails[i]);
    }
    
    
    
    public void displayAllReservation() {
    for (int i=0 ; i<numOfReservation ; i++){
    System.out.println(applicationDetails[i]);
    }
    }
  
    
    public void updateReservationDate(Date d,int i){
    applicationDetails[i].setDate(d);
    }
    
    
    public void updateReservationSweet(Sweet s, int i){
    applicationDetails[i].setSweet(s);
    }
    
    public void updateReservationMainDish(MainDish m, int i){
    applicationDetails[i].setMaindish(m);
    }
    
    public void updateReservationNP(int p,int i){
    applicationDetails[i].setNumOfP(p);
    }
    
    
    public void RoomDivider(long n){
    for(int i=0 ; i<numOfReservation ; i++){
    if(applicationDetails[i].getNumber()==n){
        
    applicationDetails[i]=new RDivider(applicationDetails[i].getName(),applicationDetails[i].getNumber(),applicationDetails[i].getSweet(),applicationDetails[i].getMaindish(),applicationDetails[i].getDate(),applicationDetails[i].getNumOfP(),applicationDetails[i].isRDivider());}}//polymorphism
    }
    
    
    public void displayRoomDivider(){
    for(int i=0 ; i<numOfReservation ; i++){
    if(applicationDetails[i] instanceof RDivider){
    System.out.println(applicationDetails[i]);}}
    }

    public void addpartition(long i){
    for(int j=0 ; j<numOfReservation ; j++){
        if (applicationDetails[j].getNumber()==i){
         
    applicationDetails[j]= new RDivider(applicationDetails[j].getName(),applicationDetails[j].getNumber(),applicationDetails[j].getSweet(),applicationDetails[j].getMaindish(),applicationDetails[j].getDate(),applicationDetails[j].getNumOfP(),applicationDetails[j].isRDivider());}//polymorphis
    }}
   
   public void displaypartiton(){
   for(int i=0 ; i < numOfReservation ; i++){
       if(applicationDetails[i] instanceof RDivider){
           System.out.println(applicationDetails[i]);}}
    }


     }
