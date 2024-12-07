

package com.mycompany.localdate;

import java.time.LocalDate;
public class Localdate {
   public Localdate(LocalDate x){
       System.out.println(x); 
   }
    public static void main(String[] args) {
      LocalDate date=LocalDate.of(2024, 12, 07);
      new Localdate(date);
    }
}
