package controllers;

import java.util.List;

import models.Employee;
import models.Filereader;

public class MainController {
    private List<Employee> employeeList;

    public MainController(String filePath) {
        this.employeeList = Filereader.loadData(filePath);
        consolePass();
    }

    public void consolePass() {
        MainConsole.showData(employeeList);
    }
}
