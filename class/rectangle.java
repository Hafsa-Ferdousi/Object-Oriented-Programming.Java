/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rectengle;

/**
 *
 * @author Asus
 */
public class rectangle {
   double w;
   double h;
  public rectangle(double w, double h) {
      this.h=h;
      this.w=w;
  }
  public double Area(){
      return w*h;
  }
  public double Perimeter(){
      
       return 2*(w*h);
      
  }
}
