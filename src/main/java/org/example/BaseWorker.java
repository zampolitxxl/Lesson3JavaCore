package org.example;

import java.util.Comparator;
import java.util.Iterator;

public  class BaseWorker implements  Comparable<BaseWorker>, Sorter, Iterable<BaseWorker> {
    public double hourSalary;

    public double fixSalary;
    protected   String name;

    public double getFixSalary() {
        return fixSalary;
    }

    public BaseWorker(String name, double hourSalary, double fixSalary) {

        this.name = name;
        this.hourSalary=hourSalary;
        this.fixSalary=fixSalary;
    }



    public double monthSalaryCounter(){
        double monthSalary = 0;
       return  monthSalary;

    }


    public String toString(OfficeWorker officeWorker) {
        String info = "name= "+ this.name + "hour= "+  this.hourSalary + "fix= "+  this.fixSalary;
        return info;
    }



    public static void bubbleSort(BaseWorker[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    BaseWorker swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }

    }

    @Override
    public int compareTo(BaseWorker o) {
        int a = (int) (this.getFixSalary()-o.getFixSalary());
        return  a;
    }


    @Override
    public int compare(BaseWorker o1, BaseWorker o2) {
        return (int) (o1.fixSalary-o2.fixSalary);
    }


    @Override
    public Iterator<BaseWorker> iterator() {
        return null;
    }
}



