package org.app.woker.entities;

import java.util.Scanner;

/**
 * Basic class for representation of Worker information.
 *
 * @author alitvinov
 */
public class Worker {

    protected String workerId;

    protected String workerName;

    protected String workerPosition = "Simple worker";


    Scanner scan = new Scanner(System.in);

    public void console(){
        System.out.println("enter id");
        this.setWorkerId(scan.nextLine());
        System.out.println("enter worker name");
        this.setWorkerName(scan.nextLine());


    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerPosition() {
        return workerPosition;
    }
}
