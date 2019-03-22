package org.app.woker.application;

import org.app.woker.entities.*;

import java.util.Scanner;

public class WorkerApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = null;
        WorkerApplication application = new WorkerApplication();

        while (command == null || !command.equals("exit")) {
            command = application.readLineWithScanner(scanner, "Please enter command (add, view, exit)");
            application.executeCommand(command);
        }
    }

    public void executeCommand(String command) {
        switch (command) {
            case "add":
                Worker newWorker = getNewWorker();
                WorkerInfoStore.getInfoStoreSingleton().add(newWorker);
                return;
            case "view":
                System.out.println("This feature is not implemented");
                return;
            case "exit":
                return;
            default:
                System.out.println("Unknown command. Please try again.");
        }
    }

    public Worker getNewWorker() {
        Scanner scanner = new Scanner(System.in);

        String id = readLineWithScanner(scanner, "Please enter worker id:");
        String name = readLineWithScanner(scanner, "Please enter worker name:");
        String type = readLineWithScanner(scanner, "Please enter worker type (p,m,q):");

        return getSpecificWorkerByType(type, new Worker(id, name), scanner);
    }

    private Worker getSpecificWorkerByType(String type, Worker baseWorker, Scanner scanner) {
        switch (type) {
            case "p":
                String language = readLineWithScanner(scanner, "Please enter language");
                String rate = readLineWithScanner(scanner, "Please enter rate");
                return new Programmer(baseWorker.getWorkerId(), baseWorker.getWorkerName(), language, rate);
            case "m":
                String project = readLineWithScanner(scanner, "Please enter project");
                return new Manager(baseWorker.getWorkerId(), baseWorker.getWorkerName(), project);
            case "q":
                return new QAEngeneer(baseWorker.getWorkerId(), baseWorker.getWorkerName(), true);
            default:
                System.out.println("Type " + type + " is unknown. Please try again.");
                return null;
        }
    }

    private String readLineWithScanner(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
