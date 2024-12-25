/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author Asus
 */
public class PartTimeEmployee extends Employee implements Payroll {
    private double hourlyRate;
    private int houseWorked;
    public PartTimeEmployee(String name, String employeeId, double hourlyRate,int houseWorked) {
        super(name, employeeId);
        this.hourlyRate=hourlyRate;
        this.houseWorked= houseWorked;

    }

   
    @Override
    public double calculateSalary() {
        return hourlyRate * houseWorked;
    }
     @Override
    public double calculateBonus() {
        return 0.5 * calculateSalary();
    }
    
}
