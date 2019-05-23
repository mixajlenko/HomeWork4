package org.app.woker.entities;

public class Manager extends Worker{

   private String project;
   private Integer expirience;
   private String workerPosition = "Manager";

    public void setProject(String project) {
        this.project = project;
    }

    public void setExpirience(Integer expirience) {
        this.expirience = expirience;
    }

    public Integer getExpirience() {
        return expirience;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Worker: ");
        sb.append("project - ").append(project);
        sb.append(", experience - ").append(expirience);
        sb.append(", workerId - ").append(workerId);
        sb.append(", workerName - ").append(workerName);
        sb.append(", workerPosition - ").append(workerPosition);
        sb.append(".\n");
        return sb.toString();
    }
}
