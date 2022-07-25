/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;

import com.example.domain.Employee;

/**
 *
 * @author Hassan
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(001);
        emp.setName("Hassan Mansoor");
        emp.setSsn("123-45-6789");
        emp.setSalary(123_456.78);

        System.out.println("Employee id: " + emp.getEmpId());
        System.out.println("Employee name: " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee salary: " + emp.getSalary());
    }

}
