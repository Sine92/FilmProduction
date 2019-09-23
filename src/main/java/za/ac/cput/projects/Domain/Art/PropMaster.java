package za.ac.cput.projects.Domain.Art;

public class PropMaster {

    private String propMasterName;
    private String propMasterNumber;
    private double propMasterRate;
    private String propMasterId;
    private String pmRole;

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
        this.pmRole = build.pmRole;

    }

    public String getPmRole() {
        return pmRole;
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
        private String pmRole;

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
        public Builder pmRole(String value)
        {
            this.pmRole = value;
            return this;
        }
        public PropMaster build()
        {
            return new PropMaster(this);
        }



    }
}
