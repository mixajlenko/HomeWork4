package org.app.woker.entities;

public class QAEngeneer extends Worker {

    private boolean automation;

    public QAEngeneer(String workerId, String workerName, boolean automation) {
        super(workerId, workerName);
        this.automation = automation;
    }

    public boolean isAutomation() {
        return automation;
    }

    public void setAutomation(boolean automation) {
        this.automation = automation;
    }

    @Override
    public String toString() {
        return "QAEngeneer{" +
                "automation=" + automation +
                ", workerId='" + workerId + '\'' +
                ", workerName='" + workerName + '\'' +
                ", workerPosition='" + workerPosition + '\'' +
                '}';
    }
}
