package org.app.woker.application;

import org.app.woker.entities.Manager;

public class OfficeApp {
    public static void main(String[] args) {
        WorkerInfoStore test = new WorkerInfoStore();
        Manager user = new Manager();
        Manager user2 = new Manager();
        Manager user3 = new Manager();
        System.out.println(test.getManagers().length);
        System.out.println(test.getManagersCount());
        test.add(user);


        System.out.println(test.getManagers().length);
        System.out.println(test.getManagersCount());
    }
}
