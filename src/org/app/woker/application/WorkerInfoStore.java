package org.app.woker.application;

import org.app.woker.entities.Manager;
import org.app.woker.entities.Programmer;
import org.app.woker.entities.QAEngineer;
import org.app.woker.entities.Worker;


public final class WorkerInfoStore {

    private static final int INITIAL_ARRAY_SIZE = 1;
    private static final int LENGTH_EXTEND_FACTOR = 2;

   private Manager [] managers = new Manager[INITIAL_ARRAY_SIZE];
   private Programmer [] programmers = new Programmer[INITIAL_ARRAY_SIZE];
   private QAEngineer[] qaEngineers = new QAEngineer[INITIAL_ARRAY_SIZE];

    private int managersCount;
    private int programmersCount;
    private int qaEngineersCount;

    public int getManagersCount() {
        return managersCount;
    }

    public int getProgrammersCount() {
        return programmersCount;
    }

    public int getQaEngineersCount() {
        return qaEngineersCount;
    }

    public void add(Manager worker) {
        if (managers.length <= managersCount) {
            managers = (Manager[]) extendArrayLength(managers);
        }
        managers[managersCount] = worker;
        managersCount += 1;
    }

    public void add(Programmer worker) {
        if (programmers.length <= programmersCount) {
            programmers = (Programmer[]) extendArrayLength(programmers);
        }
        programmers[programmersCount] = worker;
        programmersCount += 1;
    }

    public void add(QAEngineer worker) {
        if (qaEngineers.length <= qaEngineersCount) {
            qaEngineers = (QAEngineer[]) extendArrayLength(qaEngineers);
        }
        qaEngineers[qaEngineersCount] = worker;
        qaEngineersCount += 1;
    }


        public void add(Worker worker) {
            if (worker == null) {
                return;
            }
            if (worker instanceof Programmer) {
                add((Programmer) worker);
            } else if (worker instanceof Manager) {
                add((Manager) worker);
            } else if (worker instanceof QAEngineer) {
                add((QAEngineer) worker);
            } else {
                System.out.println("Unknown worker class.");
            }
            System.out.println("Worker successfully added : " + worker);
        }



    private Worker[] extendArrayLength(Worker[] source) {
        Worker[] destination = new Worker[source.length * LENGTH_EXTEND_FACTOR];
        int firstElementPosition = 0;
        System.arraycopy(source, firstElementPosition, destination, firstElementPosition, source.length);
        System.out.println("Source array was extended from " + source.length + " to " + destination.length);
        return destination;

}

    public Manager[] getManagers() {
        return managers;
    }

    public Programmer[] getProgrammers() {
        return programmers;
    }

    public QAEngineer[] getQaEngineers() {
        return qaEngineers;
    }
}
