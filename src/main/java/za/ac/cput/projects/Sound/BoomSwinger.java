package za.ac.cput.projects.Sound;

public class BoomSwinger {

    private String bsName;
    private String bsNumber;
    private double bsRate;

    public BoomSwinger()
    {

    }
    public BoomSwinger(Builder build)
    {
        this.bsName = build.bsName;
        this.bsNumber = build.bsNumber;
        this.bsRate = build.bsRate;

    }

    public String getBsName() {
        return bsName;
    }

    public String getBsNumber() {
        return bsNumber;
    }

    public double getBsRate() {
        return bsRate;
    }

    public static class Builder{

        private String bsName;
        private String bsNumber;
        private double bsRate;

        public Builder bsName(String value)
        {
            this.bsName=value;
            return this;
        }
        public Builder bsNumber(String value)
        {
            this.bsNumber = value;
            return this;
        }
        public Builder bsRate(double value)
        {
            this.bsRate = value;
            return this;
        }
        public BoomSwinger build()
        {
            return new BoomSwinger(this);
        }

    }
}
