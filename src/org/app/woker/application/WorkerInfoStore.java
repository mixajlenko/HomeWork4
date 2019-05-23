package org.app.woker.application;

import org.app.woker.entities.Manager;
import org.app.woker.entities.Programmer;
import org.app.woker.entities.QAEngineer;
import org.app.woker.entities.Worker;

import java.util.Arrays;
import java.util.Scanner;


public final class WorkerInfoStore {

    public final static WorkerInfoStore singleton = new WorkerInfoStore();

    private int ARRAY_SIZE = 1;

    private Worker[] managers = new Worker[ARRAY_SIZE];
    private Worker[] programmers = new Worker[ARRAY_SIZE];
    private Worker[] qaEngineers = new Worker[ARRAY_SIZE];

    private int mangerCounter = 1;
    private int qaengeneerCounter = 1;
    private int programmerCounter = 1;

    public static WorkerInfoStore getSingleton() {
        return singleton;
    }

    private WorkerInfoStore() {
    }

    public void add(Manager worker) {
        if (managers.length < mangerCounter) {
            managers = newArrayLength(managers);
            managers[mangerCounter - 1] = worker;
            mangerCounter++;
        } else {
            for (int i = 0; i < managers.length; i++) {
                managers[i] = worker;
                mangerCounter++;
            }
        }
    }


    public void add(Programmer worker) {
        if (programmers.length < programmerCounter) {
            programmers = newArrayLength(programmers);
            programmers[programmerCounter - 1] = worker;
            programmerCounter++;
        } else {
            for (int i = 0; i < programmers.length; i++) {
                programmers[i] = worker;
                programmerCounter++;
            }
        }
    }

    public void add(QAEngineer worker) {
        if (qaEngineers.length < qaengeneerCounter) {
            qaEngineers = newArrayLength(qaEngineers);
            qaEngineers[qaengeneerCounter - 1] = worker;
            qaengeneerCounter++;
        } else {
            for (int i = 0; i < qaEngineers.length; i++) {
                qaEngineers[i] = worker;
                qaengeneerCounter++;
            }
        }
    }

    public void add(Worker worker) {

        if (worker instanceof Programmer) {
            this.add((Programmer) worker);
        } else if (worker instanceof Manager) {
            this.add((Manager) worker);
        } else if (worker instanceof QAEngineer) {
            this.add((QAEngineer) worker);
        } else {
            System.out.println("Error");
        }
    }

    public void view() {
        System.out.println("what are you want to see?:\nWorker by type (p,m,q)\n");
        Scanner scan = new Scanner(System.in);
        String searchByType = scan.nextLine();
        switch (searchByType) {
            case ("p"):
                System.out.println(Arrays.toString(programmers));
                break;
            case ("m"):
                System.out.println(Arrays.toString(managers));
                break;
            case ("q"):
                System.out.println(Arrays.toString(qaEngineers));
                break;
            default:
                System.out.println("unknown command");
        }

    }

    private Worker[] newArrayLength(Worker[] oldArrayLength) {
        Worker[] destination = new Worker[oldArrayLength.length + 1];
        System.arraycopy(oldArrayLength, 0, destination, 0, oldArrayLength.length);
        return destination;
    }
}




