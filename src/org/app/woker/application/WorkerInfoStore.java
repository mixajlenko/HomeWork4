package org.app.woker.application;

import org.app.woker.entities.Manager;
import org.app.woker.entities.Programmer;
import org.app.woker.entities.QAEngeneer;
import org.app.woker.entities.Worker;

public final class WorkerInfoStore {

    private static final int INITIAL_ARRAY_SIZE = 1;

    /**
     * Factor for extending length of array:
     * old length  = 1
     * new length will be 1 * LENGTH_EXTEND_FACTOR
     */
    private static final int LENGTH_EXTEND_FACTOR = 2;

    public final static WorkerInfoStore infoStore = new WorkerInfoStore();

    private Worker[] managers = new Worker[INITIAL_ARRAY_SIZE];
    private Worker[] programmers = new Worker[INITIAL_ARRAY_SIZE];
    private Worker[] qaEngineers = new Worker[INITIAL_ARRAY_SIZE];

    private int managersCount;
    private int programmersCount;
    private int qaEngineersCount;

    public static WorkerInfoStore getInfoStoreSingleton() {
        return infoStore;
    }

    private WorkerInfoStore() {
    }

    public void add(Manager worker) {
        if (managers.length <= managersCount) {
            managers = extendArrayLength(managers);
        }
        managers[managersCount] = worker;
        managersCount += 1;
    }

    public void add(Programmer worker) {
        if (programmers.length <= programmersCount) {
            programmers = extendArrayLength(programmers);
        }
        programmers[programmersCount] = worker;
        programmersCount += 1;
    }

    public void add(QAEngeneer worker) {
        if (qaEngineers.length <= qaEngineersCount) {
            qaEngineers = extendArrayLength(qaEngineers);
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
        } else if (worker instanceof QAEngeneer) {
            add((QAEngeneer) worker);
        } else {
            System.out.println("Unknown worker class.");
        }
        System.out.println("Worker successfully added : " + worker);
    }

    public Worker[] getWorkersByClass(Class clazz) {
        Worker[] source = null;
        if (clazz == Programmer.class) {
            return programmers;
        } else if (clazz == Manager.class) {
            return managers;
        } else if (clazz == QAEngeneer.class) {
            return qaEngineers;
        } else {
            return null;
        }
    }

    private Worker[] extendArrayLength(Worker[] source) {
        //create new array with length = source.length * LENGTH_EXTEND_FACTOR
        Worker[] destination = new Worker[source.length * LENGTH_EXTEND_FACTOR];
        int firstElementPosition = 0;
        //This method does fast copy of one array to another.
        System.arraycopy(source, firstElementPosition, destination, firstElementPosition, source.length);
        System.out.println("Source array was extended from " + source.length + " to " + destination.length);
        return destination;
    }
}
