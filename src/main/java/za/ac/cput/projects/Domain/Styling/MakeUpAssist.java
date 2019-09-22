package za.ac.cput.projects.Domain.Styling;

public class MakeUpAssist {

    private String makeUAName;
    private String makeUANumber;
    private double makeUARate;
    private String makeUAId;

    public MakeUpAssist()
    {

    }
    public MakeUpAssist(Builder build)
    {
        this.makeUAName= build.makeUAName;
        this.makeUANumber= build.makeUANumber;
        this.makeUARate = build.makeUARate;
        this.makeUAId = build.makeUAId;

    }

    public String getMakeUAId() {
        return makeUAId;
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
        private String makeUAId;
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
        public Builder makeUAId(String value)
        {
            this.makeUAId = value;
            return this;
        }
        public MakeUpAssist build()
        {
            return new MakeUpAssist(this);
        }
    }
}
