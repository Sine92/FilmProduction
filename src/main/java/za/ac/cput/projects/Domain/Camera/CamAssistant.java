package za.ac.cput.projects.Domain.Camera;

public class CamAssistant {

    private String camAssistName;
    private String camAssistNumber;
    private double camAssistRate;

    public CamAssistant ()
    {

    }
    public CamAssistant(Builder build)
    {

        this.camAssistName = build.camAssistName;
        this.camAssistNumber = build.camAssistNumber;
        this.camAssistRate = build.camAssistRate;

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
        public CamAssistant build()
        {
            return  new CamAssistant(this);
        }






    }
}
