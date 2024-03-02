package org.example;

public class OfficeWorker extends BaseWorker{

    public OfficeWorker(String name, double hourSalary, double fixSalary) {
        super(name, hourSalary, fixSalary);
    }

    public double monthSalaryCounter() {
        double fixsalary = this.fixSalary;
        return fixsalary;

    }

    @Override
    public String toString() {
        String info = "name= "+ this.name + "hour= "+  this.hourSalary + "fix= "+  this.fixSalary;
        return info;
    }
}
