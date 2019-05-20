package za.ac.cput.projects.Domain.Art;

public class PropMaster {

    private String propMasterName;
    private String propMasterNumber;
    private double propMasterRate;

    public PropMaster()
    {

    }
    public PropMaster(Builder build)
    {
        this.propMasterName = build.propMasterName;
        this.propMasterNumber = build.propMasterNumber;
        this.propMasterRate = build.propMasterRate;

    }

    public String getPropMasterName() {
        return propMasterName;
    }

    public String getPropMasterNumber() {
        return propMasterNumber;
    }

    public double getPropMasterRate() {
        return propMasterRate;
    }
    public static class Builder{
        private String propMasterName;
        private String propMasterNumber;
        private double propMasterRate;

        public Builder propMasterName(String value)
        {
            this.propMasterName = value;
            return  this;
        }
        public Builder propMasterNu0mber(String value)
        {
            this.propMasterNumber = value;
            return this;
        }
        public Builder propMasterRate(double value)
        {
            this.propMasterRate = value;
            return  this;
        }
        public PropMaster build()
        {
            return new PropMaster(this);
        }



    }
}
