package za.ac.cput.projects.Domain.Art;

public class PropMaster {

    private String propMasterName;
    private String propMasterNumber;
    private double propMasterRate;
    private String propMasterId;

    public String getPropMasterId() {
        return propMasterId;
    }

    public PropMaster()
    {

    }
    public PropMaster(Builder build)
    {
        this.propMasterName = build.propMasterName;
        this.propMasterNumber = build.propMasterNumber;
        this.propMasterRate = build.propMasterRate;
        this.propMasterId = build.propMasterId;

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
        private String propMasterId;

        public Builder propMasterName(String value)
        {
            this.propMasterName = value;
            return  this;
        }
        public Builder propMasterNumber(String value)
        {
            this.propMasterNumber = value;
            return this;
        }
        public Builder propMasterRate(double value)
        {
            this.propMasterRate = value;
            return  this;
        }
        public Builder propMasterId(String value)
        {
            this.propMasterId = value;
            return this;
        }
        public PropMaster build()
        {
            return new PropMaster(this);
        }



    }
}
