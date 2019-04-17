package za.ac.cput.projects.Camera;

public class FocusPuller {

    private String focusPName;
    private String focusPNumber;
    private double focusPRate;

    public  FocusPuller()
    {

    }
    public FocusPuller(Builder build)
    {
      this.focusPName = build.focusPName;
      this.focusPNumber = build.focusPNumber;
      this.focusPRate = build.focusPRate;
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
        public FocusPuller build()
        {
            return  new FocusPuller(this);
        }



    }
}
