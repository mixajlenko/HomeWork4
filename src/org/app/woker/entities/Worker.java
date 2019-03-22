package org.app.woker.entities;

/**
 * Basic class for representation of Worker information.
 *
 * @author alitvinov
 */
public class Worker {

    protected final String workerId;

    protected final String workerName;

    protected String workerPosition = "Simple worker";

    public Worker(String workerId, String workerName) {
        this.workerId = workerId;
        this.workerName = workerName;
    }

    public String getWorkerId() {
        return workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public String getWorkerPosition() {
        return workerPosition;
    }

    public void setWorkerPosition(String workerPosition) {
        this.workerPosition = workerPosition;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerId='" + workerId + '\'' +
                ", workerName='" + workerName + '\'' +
                ", workerPosition='" + workerPosition + '\'' +
                '}';
    }
}
