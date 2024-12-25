/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author Asus
 */
public class Employee {
    private String name;
    private String employeeId;

public Employee ( String name ,String employeeId){
 this.name=name;
 this.employeeId=employeeId;

}
public String getName(){
    return name;
    
}
public String getEmployeeId(){
    return employeeId;
}
public void setname( String name){
    this.name=name;
}
public void displayInfo(){
    System.out.println("Namr:"+ name);
    System.out.println("Employe ID : " + employeeId);
}
}
