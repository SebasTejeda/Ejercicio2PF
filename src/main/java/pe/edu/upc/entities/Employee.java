package main.java.pe.edu.upc.entities;

public class Employee {

    private int id;
    private String name;
    private double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public boolean isTheIdCorrect(int id){
        return id == this.id;
    }

    public void salaryIncrease(int increment){
        this.salary *= (100 + increment);
        this.salary /= 100;
    }

    public String listOfEmployees() {
        return this.id + ", " + this.name + ", " + this.salary;
    }
}
