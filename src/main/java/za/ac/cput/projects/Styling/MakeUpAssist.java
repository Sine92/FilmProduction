package za.ac.cput.projects.Styling;

public class MakeUpAssist {

    private String makeUAName;
    private String makeUANumber;
    private double makeUARate;

    public MakeUpAssist()
    {

    }
    public MakeUpAssist(Builder build)
    {
        this.makeUAName= build.makeUAName;
        this.makeUANumber= build.makeUANumber;
        this.makeUARate = build.makeUARate;

    }

    public String getMakeUAName() {
        return makeUAName;
    }

    public String getMakeUANumber() {
        return makeUANumber;
    }

    public double getMakeUARate() {
        return makeUARate;
    }
    public static class Builder{
        private String makeUAName;
        private String makeUANumber;
        private double makeUARate;

        public Builder makeUAName(String value)
        {
            this.makeUAName = value;
            return this;
        }
        public Builder makeUANumber(String value)
        {
            this.makeUANumber = value;
            return this;
        }
        public Builder makeUARate(double value)
        {
            this.makeUARate = value;
            return this;
        }
        public MakeUpAssist build()
        {
            return new MakeUpAssist(this);
        }
    }
}
