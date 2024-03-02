package org.example;

public class Freelancer extends  BaseWorker {

    public Freelancer(String name, double hourSalary, double fixSalary) {
        super(name, hourSalary, fixSalary);
    }

    public double monthSalaryCounter() {
        double monthSalary = this.hourSalary *20.8*8;
        return monthSalary;

    }

    @Override
    public String toString() {
        String info = "name= "+ this.name + "hour= "+  this.hourSalary + "fix= "+  this.fixSalary;
        return info;
    }
}
