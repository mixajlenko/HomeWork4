package org.app.woker.entities;

public class QAEngineer extends Worker{

   private boolean automationQa;
   private String workerPosition = "QAEngeneer";

    public void setAutomationQa(boolean automationQa) {
        this.automationQa = automationQa;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Worker: ");
        sb.append("AutomationQa - ").append(automationQa);
        sb.append(", workerId - ").append(workerId);
        sb.append(", workerName - ").append(workerName);
        sb.append(", workerPosition - ").append(workerPosition);
        sb.append(".\n");
        return sb.toString();
    }
}

