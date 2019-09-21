package za.ac.cput.projects.Domain.Grips;

public class GripBestBoy {

    private String gbName;
    private String gbNumber;
    private double gbRate;
    private String gbId;

    public GripBestBoy()
    {

    }
    public GripBestBoy(Builder build)
    {
        this.gbName = build.gbName;
        this.gbNumber = build.gbNumber;
        this.gbRate = build.gbRate;
        this.gbId = build.gbId;

    }

    public String getGbId() {
        return gbId;
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
        private String gbId;

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
        public Builder gbId(String value)
        {
            this.gbId = value;
            return this;
        }

        public GripBestBoy build()
        {
            return new GripBestBoy(this);
        }


    }
}
