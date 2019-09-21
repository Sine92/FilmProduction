package za.ac.cput.projects.Domain.Lighting;

public class Gaffer {
    private String gafName;
    private String gafNumber;
    private double gafRate;
    private String gafId;


    public Gaffer()
    {

    }
    public Gaffer(Builder build)
    {
      this.gafName = build.gafName;
      this.gafNumber = build.gafNumber;
      this.gafRate = build.gafRate;
      this.gafId = build.gafId;
    }
    public String getGafId() {
        return gafId;
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
        private String gafId;

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
        public Builder gafId(String value)
        {
            this.gafId = value;
            return this;
        }
        public Gaffer build()
        {
            return new Gaffer(this);
        }

    }
}
