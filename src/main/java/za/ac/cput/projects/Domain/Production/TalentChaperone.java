package za.ac.cput.projects.Domain.Production;



public class TalentChaperone {

    private String talName;
    private String talNumber;
    private double talRate;
    private String talId;


    public TalentChaperone()
    {

    }
    public TalentChaperone(Builder build)
    {
        this.talName= build.talName;
        this.talNumber = build.talNumber;
        this.talRate = build.talRate;
        this.talId = build.talId;

    }

    public String getTalId() {
        return talId;
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
        private String talId;

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
        public Builder talId(String value)
        {
            this.talId = value;
            return this;
        }
        public TalentChaperone build()
        {
            return new TalentChaperone(this);
        }
    }
}
