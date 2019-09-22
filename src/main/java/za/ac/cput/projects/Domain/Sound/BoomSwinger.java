package za.ac.cput.projects.Domain.Sound;

public class BoomSwinger {

    private String bsName;
    private String bsNumber;
    private double bsRate;
    private String bsId;

    public BoomSwinger()
    {

    }
    public BoomSwinger(Builder build)
    {
        this.bsName = build.bsName;
        this.bsNumber = build.bsNumber;
        this.bsRate = build.bsRate;
        this.bsId = build.bsId;

    }

    public String getBsId() {
        return bsId;
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
        private String bsId;

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
        public Builder bsId(String value)
        {
            this.bsId = value;
            return this;
        }
        public BoomSwinger build()
        {
            return new BoomSwinger(this);
        }

    }
}
