package za.ac.cput.projects.Domain.Production;

public class ProdManager {

    private String prManName;
    private String prManNumber;
    private double prManRate;
    private String prId;

    public ProdManager()
    {

    }
    public ProdManager(Builder build)
    {
        this.prManName=build.prManName;
        this.prManNumber = build.prManNumber;
        this.prManRate = build.prManRate;
        this.prId = build.prId;

    }

    public String getPrId() {
        return prId;
    }

    public String getPrManName() {
        return prManName;
    }

    public String getPrManNumber() {
        return prManNumber;
    }

    public double getPrManRate() {
        return prManRate;
    }

    public static class Builder{
        private String prManName;
        private String prManNumber;
        private double prManRate;
        private String prId;

        public Builder prManName(String value)
        {
            this.prManName = value;
            return this;
        }
        public Builder prManNumber(String value)
        {
            this.prManNumber = value;
            return this;
        }
        public Builder prManRate(double value)
        {
            this.prManRate = value;
            return  this;
        }
        public Builder prId(String value)
        {
            this.prId = value;
            return this;
        }
        public ProdManager build()
        {
            return new ProdManager(this);
        }

    }
}
