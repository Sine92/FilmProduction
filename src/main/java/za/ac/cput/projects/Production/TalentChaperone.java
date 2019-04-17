package za.ac.cput.projects.Production;

import za.ac.cput.projects.Camera.FocusPuller;

public class TalentChaperone {

    private String talName;
    private String talNumber;
    private double talRate;


    public TalentChaperone()
    {

    }
    public TalentChaperone(Builder build)
    {
        this.talName= build.talName;
        this.talNumber = build.talNumber;
        this.talRate = build.talRate;

    }

    public String getTalName() {
        return talName;
    }

    public String getTalNumber() {
        return talNumber;
    }

    public double getTalRate() {
        return talRate;
    }
    public static class Builder{
        private String talName;
        private String talNumber;
        private double talRate;

        public Builder talName(String value)
        {
            this.talName = value;
            return this;
        }
        public Builder talNumber(String value)
        {
            this.talNumber = value;
            return this;
        }
        public Builder talRate(double value)
        {
            this.talRate = value;
            return this;
        }
        public TalentChaperone build()
        {
            return new TalentChaperone(this);
        }
    }
}
