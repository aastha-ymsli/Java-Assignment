package Assignment;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<String> employees = new ArrayList<>();

    public void addEmployee(String name) {
        employees.add(name);
    }

    public void removeEmployee(String name) {
        employees.remove(name);
    }

    public void displayEmployees() {
        System.out.println("Employees:");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee("Alice");
        manager.addEmployee("Bob");
        manager.removeEmployee("Alice");
        manager.displayEmployees();
    }
}

