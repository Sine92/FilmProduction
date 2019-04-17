package za.ac.cput.projects.Camera;

public class VTO {
    private String vTName;
    private String vTNumber;
    private double vTRate;

    public VTO ()
    {

    }
    public VTO(Builder build)
    {
     this.vTName = build.vTName;
     this.vTNumber = build.vTNumber;
     this.vTRate = build.vTRate;
    }

    public String getvTName() {
        return vTName;
    }

    public String getvTNumber() {
        return vTNumber;
    }

    public double getvTRate() {
        return vTRate;
    }
    public static class Builder{
        private String vTName;
        private String vTNumber;
        private double vTRate;

        public Builder vTName(String value)
        {
            this.vTName = value;
            return this;
        }
        public Builder vTNumber(String value)
        {
            this.vTNumber = value;
            return this;
        }
        public Builder vTRate(double value)
        {
           this.vTRate = value;
           return this;
        }
        public VTO build()
        {
            return new VTO(this);
        }



    }
}
