

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (count == employees.length) {
            return false; // Array is full
        }
        employees[count++] = employee;
        return true;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                employees[i] = employees[--count]; // Replace with last element
                employees[count] = null; // Clear last element
                return true;
            }
        }
        return false; // Employee not found
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(10);
        Employee emp1 = new Employee(1, "John Doe", "Manager", 75000);
        Employee emp2 = new Employee(2, "Jane Smith", "Developer", 65000);

        system.addEmployee(emp1);
        system.addEmployee(emp2);

        system.traverseEmployees();

        Employee searchResult = system.searchEmployee(1);
        if (searchResult != null) {
            System.out.println("Found: " + searchResult);
        } else {
            System.out.println("Employee not found");
        }

        system.deleteEmployee(1);
        system.traverseEmployees();
    }
}
