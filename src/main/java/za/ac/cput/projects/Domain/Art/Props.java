package za.ac.cput.projects.Domain.Art;

public class Props {

    private String propsName;
    private String propsNumber;
    private double propsRate;
    private String propId;
    private String ppRole;

    public String getPropId() {
        return propId;
    }

    private Props()
    {

    }
    public Props(Builder build)
    {
     this.propsName = build.propsName;
     this.propsNumber = build.propsNumber;
     this.propsRate = build.propsRate;
     this.propId = build.propId;
        this.ppRole = build.ppRole;
    }

    public String getPpRole() {
        return ppRole;
    }

    public String getPropsName() {
        return propsName;
    }

    public String getPropsNumber() {
        return propsNumber;
    }

    public double getPropsRate() {
        return propsRate;
    }
    public static class Builder{
        private String propsName;
        private String propsNumber;
        private double propsRate;
        private String propId;
        private String ppRole;

        public Builder propsName(String value)
        {
            this.propsName = value;
            return this;
        }
        public Builder propsNumber(String value)
        {
            this.propsNumber = value;
            return this;
        }
        public Builder propsRate(double value)
        {
            this.propsRate = value;
            return this;
        }
        public Builder propId(String value)
        {
            this.propId = value;
            return this;
        }
        public Builder ppRole(String value)
        {
            this.ppRole = value;
            return this;
        }

        public Props build()
        {
            return new Props(this);
        }



    }

}
