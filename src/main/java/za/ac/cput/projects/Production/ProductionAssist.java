package za.ac.cput.projects.Production;

public class ProductionAssist {
    private String paName;
    private String paNumber;
    private double paRate;

    public ProductionAssist()
    {

    }
    public ProductionAssist(Builder build)
    {
     this.paName = build.paName;
     this.paNumber = build.paNumber;
     this.paRate = build.paRate;

    }

    public String getPaName() {
        return paName;
    }

    public String getPaNumber() {
        return paNumber;
    }

    public double getPaRate() {
        return paRate;
    }
    public static class Builder{
        private String paName;
        private String paNumber;
        private double paRate;

        public Builder paName(String value)
        {
            this.paName = value;
            return this;
        }
        public Builder paNumber(String value)
        {
            this.paNumber = value;
            return  this;
        }
        public Builder paRate(double value)
        {
            this.paRate = value;
            return this;
        }
        public ProductionAssist build()
        {
            return new ProductionAssist(this);
        }

    }
}
