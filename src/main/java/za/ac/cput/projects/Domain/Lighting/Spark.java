package za.ac.cput.projects.Domain.Lighting;

public class Spark {

    private String spName;
    private String spNumber;
    private double spRate;
    private String spId;

    public Spark()
    {

    }
    public Spark(Builder build)
    {
     this.spName = build.spName;
     this.spNumber = build.spNumber;
     this.spRate = build.spRate;
    }

    public String getSpId() {
        return spId;
    }

    public String getSpName() {
        return spName;
    }

    public String getSpNumber() {
        return spNumber;
    }

    public double getSpRate() {
        return spRate;
    }
    public static class Builder{
        private String spName;
        private String spNumber;
        private double spRate;
        private String spId;

        public Builder spName(String value)
        {
            this.spName = value;
            return this;
        }
        public Builder spNumber(String value)
        {
            this.spNumber = value;
            return this;
        }
        public Builder spRate(double value)
        {
            this.spRate = value;
            return this;
        }
        public Builder spId(String value)
        {
            this.spId = value;
            return this;
        }
        public Spark build()
        {
            return new Spark(this);
        }


    }

}
