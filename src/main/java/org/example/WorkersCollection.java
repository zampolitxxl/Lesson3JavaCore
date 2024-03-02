package org.example;

import java.util.ArrayList;
import java.util.List;

public class WorkersCollection {
    List<BaseWorker> workerCollection;

    public WorkersCollection() {
       this.workerCollection = new ArrayList<>();
    }

    public void  addWorker(BaseWorker worker){
        this.workerCollection.add(worker);
    }

    public  void  printCollection(){
        for (BaseWorker worker: this.workerCollection
             ) {
            System.out.println("Работник= " + worker);

        }
    }
}
