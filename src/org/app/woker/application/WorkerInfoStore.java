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


    private Manager[] managers = new Manager[ARRAY_SIZE];
    private Programmer[] programmers = new Programmer[ARRAY_SIZE];
    private QAEngineer[] qaEngineers = new QAEngineer[ARRAY_SIZE];


    private int mangerCounter = 1;
    private int qaengeneerCounter = 1;
    private int programmerCounter = 1;

    public static WorkerInfoStore getSingleton() {
        return singleton;
    }

    private WorkerInfoStore() {
    }


    public void add(Manager worker) {
        Manager[] destination;
        if (mangerCounter == managers.length) {
            for (int i = 0; i < managers.length; i++) {
                managers[i] = worker;
                mangerCounter++;
            }
        } else {
            destination = new Manager[mangerCounter];
            System.arraycopy(managers, 0, destination, 0, managers.length);
            destination[mangerCounter - 1] = worker;
            managers = destination;
            mangerCounter++;
//            System.out.println(Arrays.toString(destination));

        }

//        System.out.println(Arrays.toString(managers) + "ssssssss");
//        System.out.println(mangerCounter);

    }


    public void add(Programmer worker) {
        Programmer[] destination;
        if (programmerCounter == programmers.length) {
            for (int i = 0; i < programmers.length; i++) {
                programmers[i] = worker;
                programmerCounter++;
            }
        } else {
            destination = new Programmer[programmerCounter];
            System.arraycopy(programmers, 0, destination, 0, programmers.length);
            destination[programmerCounter - 1] = worker;
            programmers = destination;
            programmerCounter++;
//            System.out.println(Arrays.toString(destination));

        }

//        System.out.println(Arrays.toString(programmers) + "ssssssss");
//        System.out.println(programmerCounter);
    }


    public void add(QAEngineer worker) {
        QAEngineer[] destination;
        if (qaengeneerCounter == qaEngineers.length) {
            for (int i = 0; i < qaEngineers.length; i++) {
                qaEngineers[i] = worker;
                qaengeneerCounter++;
            }
        } else {
            destination = new QAEngineer[qaengeneerCounter];
            System.arraycopy(qaEngineers, 0, destination, 0, qaEngineers.length);
            destination[qaengeneerCounter - 1] = worker;
            qaEngineers = destination;
            qaengeneerCounter++;
//            System.out.println(Arrays.toString(destination));

        }

//        System.out.println(Arrays.toString(qaEngineers) + "ssssssss");
//        System.out.println(qaengeneerCounter);
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
        switch (searchByType){
            case("p"):
                System.out.println(Arrays.toString(programmers));
                break;
            case("m"):
                System.out.println(Arrays.toString(managers));
                break;
            case("q"):
                System.out.println(Arrays.toString(qaEngineers));
                break;
                default:
                    System.out.println("unknown command");
    }
}
    }




