/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testprojectoop;

import java.util.Scanner;

/**
 *
 * @author Roba
 */
public class TestProjectOOP {

    public static void main(String[] args) {
        
         
       Scanner in = new Scanner(System.in);
       Reservation re=new Reservation();
       
       int x=0;
      while(x<=6){
       
       System.out.println("1- Add Reservation \n2- Update Reservation \n3- Display Reservation \n4- Display All Reservation \n5- Add Partition \n 6- Display All Reservation with Partition\n7- Exit");
       
       System.out.println("Enter the number of serves :");
       x=in.nextInt();
        
        
       switch(x){
           case 1:
               if (Reservation.numOfReservation<11){
               System.out.println("enter your name:");
               String name=in.next();
               System.out.println("enter your number");
               long num=in.nextLong(); 
               int numOfP;
               System.out.println("enter number of people: \n the maximum number is 6");   
               numOfP=in.nextInt();
              while(numOfP > 6){
                System.out.println("ERROR\nselect again "); 
                numOfP=in.nextInt();}
              
              
              System.out.println("enter day:");
              int d=in.nextInt();
              System.out.println("enter month:");
              int m=in.nextInt();
              System.out.println("enter year:");
              int y=in.nextInt();
              System.out.println("enter hour:");
              int h=in.nextInt();
              System.out.println("enter minute:");
              int min=in.nextInt();
              Date date=new Date(d,m,y,h,min);
              
              int id=0;
              String food="";
              int total=0;
              System.out.println("select ");
              System.out.println("1- Breakfast \n2-Lunch \n3-Dinner");
              id=in.nextInt();
              while(id>=4){
                System.out.println("ERROR\nselect again ");
                id=in.nextInt();}
              switch(id){
                  case 1: total=50*numOfP;
                  food="Breakfast";
                  break;
                  
                  case 2: total=80*numOfP;
                  food="Lunch";
                  break;
                  
                  case 3: total=150*numOfP;
                  food="Dinner";
                  break;
              default:  
              }
              
              Menu menu=new Menu(id,total,food);
              
             Customer cu = new Customer (name,num,menu,date,numOfP); 
             re.addReservation(cu);
               }else{ 
                   System.out.println("sorry the restaurant is full");}
               break;
               
               
           case 2:
               System.out.println("enter your number");
               long num=in.nextLong(); 
               for (int i=0 ; i < Reservation.numOfReservation ; i++){
             if (re.applicationDetails[i].getNumber()==num){
                  int u=0;
                 
                  System.out.println("select what you want to update ");
                  System.out.println("1- date \n2- menu \n3- number of people");
                  u=in.nextInt();
                   while(u>=4){
                   System.out.println("ERROR\nselect again ");     
                   u=in.nextInt();
                   }
                  switch(u){
                      case 1: System.out.println("enter day:");
                              int d=in.nextInt();
                              System.out.println("enter month:");
                              int m=in.nextInt();
                              System.out.println("enter year:");
                              int y=in.nextInt();
                              System.out.println("enter hour:");
                              int h=in.nextInt();
                              System.out.println("enter minute:");
                              int min=in.nextInt();
                              Date date=new Date(d,m,y,h,min);
                              re.updateReservationDate(date, i);
                              break;
                              
                      case 2: int id=0;
                              String food="";
                              int total=0;
                              
                              System.out.println("select  ");
                              System.out.println("1- Breakfast \n2-Lunch \n3-Dinner");
                              id=in.nextInt();
                              while(id>4){
                                   System.out.println("ERROR\nselect again "); 
                                  id=in.nextInt();
                              }
                              switch(id){
                              case 1: total=50*re.applicationDetails[i].getNumOfP();
                              food="Breakfast";
                              break;
                  
                              case 2: total=80*re.applicationDetails[i].getNumOfP();
                              food="Lunch";
                              break;
                  
                              case 3: total=150*re.applicationDetails[i].getNumOfP();
                              food="Dinner";
                               break;
              
                              }
              
                                Menu menu=new Menu(id,total,food);  
                                re.updateReservationMenu(menu, i);
                              break;
                              
                       case 3:
                               int numOfP;
                              
                               System.out.println("enter number of people: \n the maximum number is 6");   
                               numOfP=in.nextInt();
                               while(numOfP >= 7){
                                   System.out.println("ERROR\nselect again ");
                                   numOfP=in.nextInt();
                               } 
                               Customer cu = new Customer (re.applicationDetails[i].getName(),num,numOfP) {};
                               re.updateReservationNP(numOfP, i);
                               break;
                               }
             }}break;
                   
                               
           case 3:
             System.out.println("Enter number of Reservation");
             long num1=in.nextLong();
             for(int i =0 ;i<Reservation.numOfReservation;i++){
             if (re.applicationDetails[i].getNumber()==num1){
             
             re.displayReservation(i);}
             }
             break;
             
           case 4:
               re.displayAllReservation();
               break;
               
           case 5:
             System.out.println("Enter number of Reservation");
             long parnum=in.nextLong();
             re.addpartition(parnum);
               break;
               
           case 6:
               re.displayRoomDivider();
               break;
               
           case 7: System.exit(0);
          
       }
    
       
       
    }
    }}
