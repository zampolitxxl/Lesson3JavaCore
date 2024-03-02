package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        OfficeWorker ivan = new OfficeWorker("Ivan", 0, 80000);
        double monthSalaryIvan = ivan.monthSalaryCounter();
        System.out.println(monthSalaryIvan);

        OfficeWorker sergei = new OfficeWorker("Sergei", 0, 50000);


        Freelancer masha = new Freelancer("masha", 350, 0);
        double monthSalaryMasha  =masha.monthSalaryCounter();
        System.out.println(monthSalaryMasha);

        Freelancer irina = new Freelancer("irina", 500, 0);




        BaseWorker[] workers = {ivan, masha, sergei, irina};


        List<BaseWorker> baseWorkers = new ArrayList<>();

        baseWorkers.add(ivan);
        baseWorkers.add(sergei);

        baseWorkers.add(masha);
        baseWorkers.add(irina);

        System.out.println("Неотсортировано "+ baseWorkers);


        Collections.sort(baseWorkers);

        System.out.println("Отсортировано "+ baseWorkers);


        //Задача на итератор

        WorkersCollection workersCollection= new WorkersCollection();

        workersCollection.addWorker(irina);
        workersCollection.addWorker(masha);
        workersCollection.addWorker(ivan);
        workersCollection.addWorker(sergei);


        workersCollection.printCollection();








    }
}