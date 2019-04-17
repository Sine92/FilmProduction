package za.ac.cput.projects.Catering;

public class CaterTeamLeader {

    private String ctTName;
    private String ctTNumber;
    private double ctTRate;

    public CaterTeamLeader()
    {

    }

    public CaterTeamLeader(Builder build)
    {
      this.ctTName = build.ctTName;
      this.ctTNumber = build.ctTNumber;
      this.ctTRate = build.ctTRate;
    }
    public String getCtTName() {
        return ctTName;
    }

    public String getCtTNumber() {
        return ctTNumber;
    }

    public double getCtTRate() {
        return ctTRate;
    }

    public static class Builder{

        private String ctTName;
        private String ctTNumber;
        private double ctTRate;

        public Builder ctTName(String value)
        {
           this.ctTName = value;
           return this;
        }
        public Builder ctNumber(String value)
        {
            this.ctTNumber = value;
            return this;
        }
        public Builder ctTRate(double value)
        {
            this.ctTRate = value;
            return this;
        }

        public CaterTeamLeader build()
        {
            return new CaterTeamLeader(this);
        }


    }


}
