package org.app.woker.entities;

/*
 * Class for representation info about manager.
 *
 * @author alitvinov
 */
public class Manager extends Worker{

   private String project;

   private int expirience;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    @Override
    public String getWorkerPosition() {
        return super.getWorkerPosition();
    }
}
