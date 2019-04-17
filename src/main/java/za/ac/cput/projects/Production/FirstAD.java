package za.ac.cput.projects.Production;

public class FirstAD {

    private String fAdName;
    private String fAdNumber;
    private double fAdRate;

    public FirstAD ()
    {

    }
    public FirstAD (Builder build)
    {
      this.fAdName = build.fAdName;
      this.fAdNumber= build.fAdNumber;
      this.fAdRate = build.fAdRate;
    }

    public String getfAdName() {
        return fAdName;
    }

    public String getfAdNumber() {
        return fAdNumber;
    }

    public double getfAdRate() {
        return fAdRate;
    }
    public static class Builder{
        private String fAdName;
        private String fAdNumber;
        private double fAdRate;

        public Builder fAdName(String value)
        {
            this.fAdName = value;
            return this;
        }
        public Builder fAdNumber(String value)
        {
            this.fAdNumber = value;
            return this;
        }
        public Builder fAdRate(double value)
        {
            this.fAdRate = value;
            return this;
        }
        public FirstAD build()
        {
            return new FirstAD(this);
        }


    }
}
