package za.ac.cput.projects.Production;

public class ProdManager {

    private String prManName;
    private String prManNumber;
    private double prManRate;

    public ProdManager()
    {

    }
    public ProdManager(Builder build)
    {
        this.prManName=build.prManName;
        this.prManNumber = build.prManNumber;
        this.prManRate = build.prManRate;

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
        public ProdManager build()
        {
            return new ProdManager(this);
        }

    }
}