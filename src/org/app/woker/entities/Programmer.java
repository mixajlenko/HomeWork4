package org.app.woker.entities;

/**
 * Class for representation info about programmer.
 *
 * @author alitvinov
 */
public class Programmer extends Worker{

   private String language;

   private String rate;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String getWorkerPosition() {
        return super.getWorkerPosition();
    }
}
