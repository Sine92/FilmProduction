package za.ac.cput.projects.Unit;

public class UnitManager {

    private String unMName;
    private String unMNumber;
    private double unMRate;

    public UnitManager()
    {

    }
    public UnitManager(Builder build)
    {
        this.unMName = build.unMName;
        this.unMNumber = build.unMNumber;
        this.unMRate =build.unMRate;

    }

    public String getUnMName() {
        return unMName;
    }

    public String getUnMNumber() {
        return unMNumber;
    }

    public double getUnMRate() {
        return unMRate;
    }
    public static class Builder{
        private String unMName;
        private String unMNumber;
        private double unMRate;

        public Builder unMName(String value)
        {
            this.unMName = value;
            return this;
        }
        public Builder unMNumber(String value)
        {
            this.unMNumber = value;
            return this;
        }
        public Builder unMRate(double value)
        {
            this.unMRate = value;
            return this;
        }
        public UnitManager build()
        {
            return new UnitManager(this);
        }


    }
}
