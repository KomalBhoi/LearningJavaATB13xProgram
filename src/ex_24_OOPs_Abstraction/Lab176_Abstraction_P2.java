package ex_24_OOPs_Abstraction;

public class Lab176_Abstraction_P2 {
    public static void main(String[] args) {
        // Employee e1 = new Employee();
        company c1 = new company();
        c1.computePay();
        }
}

    class company extends Employee{
        @Override
        double computePay(){
            return 1000;
        }
    }

  abstract class Employee{

    private String name;
    private String address;
    private int number;

    Employee(){
        System.out.println("DC");
    }

    Employee(String name, String address, int number){
        System.out.println("Constructing an employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay();

    void mailCheck(){
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
  }
