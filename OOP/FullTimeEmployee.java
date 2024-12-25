/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author Asus
 */
public class FullTimeEmployee extends Employee implements Payroll {
    private double monthlySalary;
    public FullTimeEmployee(String name, String employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    
    @Override
    public double calculateSalary() {
       return 91* monthlySalary;
    }
    @Override
    public double calculateBonus() {
        return monthlySalary;
    }
}
