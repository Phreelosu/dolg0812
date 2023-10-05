/*
* File: MainConsole.java
* Author: Rátkay Dániel
* Copyright: 2023, Rátkay Dániel
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/Phreelosu/dolg0812
* Licenc: GNU GPL
*/
package controllers;
import java.util.List;

import models.Employee;
import models.Filereader;

public class MainConsole {
    public static void showData(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println("Név: " + employee.getNev());
            System.out.println("Település: " + employee.getTelepules());
            System.out.println("Cím: " + employee.getCim());
            System.out.println("Születés: " + employee.getSzuletes());
            System.out.println("Fizetés: " + employee.getFizetes());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Filereader.loadData("src/filbt.txt");
        showData(employeeList);
    }
}
