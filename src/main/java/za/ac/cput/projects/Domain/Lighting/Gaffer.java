package za.ac.cput.projects.Domain.Lighting;

public class Gaffer {
    private String gafName;
    private String gafNumber;
    private double gafRate;

    public Gaffer()
    {

    }
    public Gaffer(Builder build)
    {
      this.gafName = build.gafName;
      this.gafNumber = build.gafNumber;
      this.gafRate = build.gafRate;
    }

    public String getGafName() {
        return gafName;
    }

    public String getGafNumber() {
        return gafNumber;
    }

    public double getGafRate() {
        return gafRate;
    }
    public static class Builder{

        private String gafName;
        private String gafNumber;
        private double gafRate;

        public Builder gafName(String value)
        {
            this.gafName = value;
            return this;
        }
        public Builder gafNumber(String value)
        {
            this.gafNumber = value;
            return this;
        }
        public Builder gafRate(double value)
        {
            this.gafRate = value;
            return this;
        }
        public Gaffer build()
        {
            return new Gaffer(this);
        }

    }
}
