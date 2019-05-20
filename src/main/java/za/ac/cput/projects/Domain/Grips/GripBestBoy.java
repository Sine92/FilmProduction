package za.ac.cput.projects.Domain.Grips;

public class GripBestBoy {

    private String gbName;
    private String gbNumber;
    private double gbRate;

    public GripBestBoy()
    {

    }
    public GripBestBoy(Builder build)
    {
        this.gbName = build.gbName;
        this.gbNumber = build.gbNumber;
        this.gbRate = build.gbRate;

    }

    public String getGbName() {
        return gbName;
    }

    public String getGbNumber() {
        return gbNumber;
    }

    public double getGbRate() {
        return gbRate;
    }

    public static class Builder{

        private String gbName;
        private String gbNumber;
        private double gbRate;

        public Builder gbName(String value)
        {
            this.gbName = value;
            return this;
        }
        public Builder gbNumber(String value)
        {
            this.gbNumber = value;
            return this;
        }
        public Builder gbRate(double value)
        {
            this.gbRate = value;
            return this;
        }
        public GripBestBoy build()
        {
            return new GripBestBoy(this);
        }


    }
}
