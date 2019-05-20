package za.ac.cput.projects.Domain.Art;

public class Props {

    private String propsName;
    private String propsNumber;
    private double propsRate;

    private Props()
    {

    }
    public Props(Builder build)
    {
     this.propsName = build.propsName;
     this.propsNumber = build.propsNumber;
     this.propsRate = build.propsRate;
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
        public Props build()
        {
            return new Props(this);
        }



    }

}