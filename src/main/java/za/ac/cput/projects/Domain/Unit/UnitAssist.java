package za.ac.cput.projects.Domain.Unit;

public class UnitAssist {

    private String unName;
    private String unNumber;
    private double unRate;
    private String unId;

    public UnitAssist()
    {

    }
    public UnitAssist(Builder build)
    {
        this.unName = build.unName;
        this.unNumber = build.unNumber;
        this.unRate = build.unRate;
        this.unId = build.unId;

    }

    public String getUnId() {
        return unId;
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
        private String unId;

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
        public  Builder unId(String value)
        {
            this.unId = value;
            return this;
        }
        public UnitAssist build()
        {
            return new UnitAssist(this);
        }

    }
}
