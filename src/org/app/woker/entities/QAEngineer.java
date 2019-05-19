package org.app.woker.entities;

/*
 * Class for representation info about QA engineer.
 *
 * @author alitvinov
 */
public class QAEngineer extends Worker{

   private boolean automationQa;

    public boolean isAutomationQa() {
        return automationQa;
    }

    public void setAutomationQa(boolean automationQa) {
        this.automationQa = automationQa;
    }

    @Override
    public String getWorkerPosition() {
        return super.getWorkerPosition();
    }
}
