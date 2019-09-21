package za.ac.cput.projects.Domain.Camera;

public class VTO {
    private String vTName;
    private String vTNumber;
    private double vTRate;
    private String vtId;

    public String getVtId() {
        return vtId;
    }

    public VTO ()
    {

    }
    public VTO(Builder build)
    {
     this.vTName = build.vTName;
     this.vTNumber = build.vTNumber;
     this.vTRate = build.vTRate;
     this.vtId = build.vtId;
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
        private String vtId;

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
        public Builder vtId(String value)
        {
            this.vtId = value;
            return this;
        }
        public VTO build()
        {
            return new VTO(this);
        }



    }
}
