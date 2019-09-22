package za.ac.cput.projects.Domain.Production;

public class ProductionAssist {
    private String paName;
    private String paNumber;
    private double paRate;
    private String paId;

    public ProductionAssist()
    {

    }
    public ProductionAssist(Builder build)
    {
     this.paName = build.paName;
     this.paNumber = build.paNumber;
     this.paRate = build.paRate;
     this.paId = build.paId;

    }

    public String getPaId() {
        return paId;
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
        private String paId;

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
        public Builder paId(String value)
        {
            this.paId = value;
            return this;
        }
        public ProductionAssist build()
        {
            return new ProductionAssist(this);
        }

    }
}
