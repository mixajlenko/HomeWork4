package org.app.woker.application;

import org.app.woker.entities.Manager;
import org.app.woker.entities.Programmer;
import org.app.woker.entities.QAEngineer;
import org.app.woker.entities.Worker;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OfficeApp {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String command = null;
        OfficeApp test = new OfficeApp();
        while (command == null || !command.equals("exit")) {
            command = test.readLine(reader, "add - добавить\n view - показать\n exit - выход");
            test.application(command);
        }
    }

    private Scanner scan = new Scanner(System.in);

    public void application(String command) {
        switch (command) {
            case ("add"):
                add();
                break;
            case ("view"):
                WorkerInfoStore.getSingleton().view();
                break;
            case ("exit"):
                return;
        }

    }

    public void add() throws InputMismatchException {
        System.out.println("enter the worker type");
        String type = scan.nextLine();
        switch (type) {
            case ("Programmer"):
                Worker w = new Programmer();
                w.console();
                System.out.println("enter language");
                ((Programmer) w).setLanguage(scan.nextLine());
                System.out.println("enter worker rate");
                ((Programmer) w).setRate(scan.nextLine());
                WorkerInfoStore.getSingleton().add(w);
                System.out.println("\nworker is successfully added\n");
                //this.application();
                break;

            case ("Manager"):
                Worker m = new Manager();
                m.console();
                System.out.println("enter project");
                ((Manager) m).setProject(scan.nextLine());
                System.out.println("enter worker experience");
                ((Manager) m).setExpirience(scan.nextInt());
//                while ( ((Manager) m).getExpirience() == 0) {
//                    try {
//                        ((Manager) m).setExpirience(scan.nextInt());
//                    } catch (InputMismatchException e) {
//                        System.out.println("you need enter value of expirience (int)\nenter worker experience\n");
//                    }
//                }
                    //while (!scan.hasNextInt())
                    WorkerInfoStore.getSingleton().add(m);
                    System.out.println("\nworker is successfully added\n");
                    break;

                    case ("QAE"):
                        Worker q = new QAEngineer();
                        q.console();
                        System.out.println("enter automation (true/false)");
                        ((QAEngineer) q).setAutomationQa(scan.nextBoolean());
                        WorkerInfoStore.getSingleton().add(q);
                        System.out.println("\nworker is successfully added\n");
                        break;
                }
        }


        private String readLine (Scanner consoleInputReader, String message){
            System.out.println(message);
            return consoleInputReader.nextLine();
        }
    }



