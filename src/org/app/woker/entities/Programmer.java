package org.app.woker.entities;

public class Programmer extends Worker {

   private String language;
   private String rate;
   private String workerPosition = "Programmer";



    public void setLanguage(String language) {

        this.language = language;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String getWorkerPosition() {
        return super.getWorkerPosition();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Worker: ");
        sb.append("language - ").append(language);
        sb.append(", rate - ").append(rate);
        sb.append(", workerId - ").append(workerId);
        sb.append(", workerName - ").append(workerName);
        sb.append(", workerPosition - ").append(workerPosition);
        sb.append(".\n");
        return sb.toString();
    }


}
