package main.java.pe.edu.upc.application;

import main.java.pe.edu.upc.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int number_of_employees = sc.nextInt();

        for(int i = 0; i < number_of_employees; i++){
            System.out.println("\nEmployee #" + (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employees.add(employee);
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int ask_id = sc.nextInt();
        sc.nextLine();

        employees.stream()
                .filter(employee -> employee.isTheIdCorrect(ask_id))
                .forEach(employee -> {
                    System.out.println("Enter the percentage: ");
                    int increment = sc.nextInt();
                    employee.salaryIncrease(increment);
                });

        System.out.println("\nList of employees: ");
        employees.stream()
                .map(Employee::listOfEmployees)
                .forEach(System.out::println);
    }
}
