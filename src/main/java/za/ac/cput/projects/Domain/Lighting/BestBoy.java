package za.ac.cput.projects.Domain.Lighting;

public class BestBoy {
    private String bbName;
    private String bbNumber;
    private double bbRate;

    public  BestBoy()
    {

    }
    public  BestBoy(Builder build)
    {
        this.bbName = build.bbName;
        this.bbName = build.bbNumber;
        this.bbRate = build.bbRate;

    }

    public String getBbName() {
        return bbName;
    }

    public String getBbNumber() {
        return bbNumber;
    }

    public double getBbRate() {
        return bbRate;
    }
    public static class Builder{
        private String bbName;
        private String bbNumber;
        private double bbRate;

        public Builder bbName(String value)
        {
            this.bbName = value;
            return this;
        }
        public Builder bbNumber(String value)
        {
            this.bbNumber = value;
            return this;
        }
        public Builder bbRate(double value)
        {
            this.bbRate = value;
            return this;
        }
        public BestBoy build()
        {
            return new BestBoy(this);
        }

    }
}
