package za.ac.cput.projects.Domain.Catering;

public class CaterTeamLeader {

    private String ctTName;
    private String ctTNumber;
    private double ctTRate;
    private String ctTId;

    public CaterTeamLeader()
    {

    }

    public CaterTeamLeader(Builder build)
    {
      this.ctTName = build.ctTName;
      this.ctTNumber = build.ctTNumber;
      this.ctTRate = build.ctTRate;
      this.ctTId = build.ctTId;
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

    public String getCtTId() {
        return ctTId;
    }

    public static class Builder{

        private String ctTName;
        private String ctTNumber;
        private double ctTRate;
        private String ctTId;

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
        public Builder vtId(String value)
        {
            this.ctTId = value;
            return this;
        }

        public CaterTeamLeader build()
        {
            return new CaterTeamLeader(this);
        }


    }


}
