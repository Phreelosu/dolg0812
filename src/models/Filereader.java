/*
* File: Filereader.java
* Author: Rátkay Dániel
* Copyright: 2023, Rátkay Dániel
* Group: Szoft II/2/N
* Date: 2023-10-05
* Github: https://github.com/Phreelosu/dolg0812
* Licenc: GNU GPL
*/
package models;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Filereader {
    public static List<Employee> loadData(String filePath) {
        filePath = new String("src/filbt.txt");
        List<Employee> employeeList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] ababa = line.split(":");
                if (ababa.length == 5) {
                    String nev = ababa[0];
                    String telepules = ababa[1];
                    String cim = ababa[2];
                    String szuletes = ababa[3];
                    int fizetes = Integer.parseInt(ababa[4]);

                    Employee employee = new Employee(nev, telepules, cim, szuletes, fizetes);
                    employeeList.add(employee);
                    
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
        
    }
}
