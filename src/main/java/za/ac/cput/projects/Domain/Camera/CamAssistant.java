package za.ac.cput.projects.Domain.Camera;

public class CamAssistant {

    private String camAssistName;
    private String camAssistNumber;
    private double camAssistRate;
    private String camAssId;

    public String getCamAssId() {
        return camAssId;
    }

    public CamAssistant ()
    {

    }
    public CamAssistant(Builder build)
    {

        this.camAssistName = build.camAssistName;
        this.camAssistNumber = build.camAssistNumber;
        this.camAssistRate = build.camAssistRate;
        this.camAssId = build.camAssId;

    }

    public String getCamAssistName() {
        return camAssistName;
    }

    public String getCamAssistNumber() {
        return camAssistNumber;
    }

    public double getCamAssistRate() {
        return camAssistRate;
    }
    public static class Builder
    {
        private String camAssistName;
        private String camAssistNumber;
        private double camAssistRate;
        private String camAssId;
        public Builder camAssistName(String value)
        {
            this.camAssistName = value;
            return  this;
        }
        public Builder camAssistNumber(String value)
        {
            this.camAssistNumber =value;
            return this;
        }
        public Builder camAssistRate(double value)
        {
            this.camAssistRate = value;
            return this;
        }
        public Builder camAssId(String value)
        {
           this.camAssId = value;
           return this;
        }
        public CamAssistant build()
        {
            return  new CamAssistant(this);
        }






    }
}
