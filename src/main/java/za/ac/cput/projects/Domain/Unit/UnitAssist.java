package za.ac.cput.projects.Domain.Unit;

public class UnitAssist {

    private String unName;
    private String unNumber;
    private double unRate;

    public UnitAssist()
    {

    }
    public UnitAssist(Builder build)
    {
        this.unName = build.unName;
        this.unNumber = build.unNumber;
        this.unRate = build.unRate;

    }

    public String getUnName() {
        return unName;
    }

    public String getUnNumber() {
        return unNumber;
    }

    public double getUnRate() {
        return unRate;
    }

    public static class Builder{
        private String unName;
        private String unNumber;
        private double unRate;

        public Builder unName(String value)
        {
            this.unName= value;
            return this;
        }
        public Builder unNumber(String value)
        {
            this.unNumber = value;
            return this;
        }
        public Builder unRate(double value)
        {
            this.unRate = value;
            return this;
        }
        public UnitAssist build()
        {
            return new UnitAssist(this);
        }

    }
}
