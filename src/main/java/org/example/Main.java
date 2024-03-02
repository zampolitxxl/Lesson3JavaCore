package org.example;

import java.util.Collection;

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


    }
}