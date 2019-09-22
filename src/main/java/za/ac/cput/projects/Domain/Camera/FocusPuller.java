package za.ac.cput.projects.Domain.Camera;

public class FocusPuller {

    private String focusPName;
    private String focusPNumber;
    private double focusPRate;
    private String focusPullerId;

    public  FocusPuller()
    {

    }
    public FocusPuller(Builder build)
    {
      this.focusPName = build.focusPName;
      this.focusPNumber = build.focusPNumber;
      this.focusPRate = build.focusPRate;
      this.focusPullerId= build.focusPullerId;
    }

    public String getFocusPullerId() {
        return focusPullerId;
    }

    public String getFocusPName() {
        return focusPName;
    }

    public String getFocusPNumber() {
        return focusPNumber;
    }

    public double getFocusPRate() {
        return focusPRate;
    }
    public static class Builder{

        private String focusPName;
        private String focusPNumber;
        private double focusPRate;
        private String focusPullerId;


        public Builder focusPName(String value)
        {
            this.focusPName = value;
            return  this;
        }
        public Builder focusPNumber(String value)
        {
            this.focusPNumber = value;
            return this;
        }
        public Builder focusPRate(double value)
        {
            this.focusPRate = value;
            return this;
        }
        public Builder focusPullerId(String value)
        {
            this.focusPullerId = value;
            return this;
        }
        public FocusPuller build()
        {
            return  new FocusPuller(this);
        }



    }
}
