package za.ac.cput.projects.Camera;

public class DIT {

    private String ditName;
    private String ditNumber;
    private double ditRate;

    public DIT()
    {

    }
    public DIT(Builder build)
    {
        this.ditName = build.ditName;
        this.ditNumber = build.ditNumber;
        this.ditRate = build.ditRate;

    }

    public String getDitName() {
        return ditName;
    }

    public String getDitNumber() {
        return ditNumber;
    }

    public double getDitRate() {
        return ditRate;
    }
    public static class Builder{

        private String ditName;
        private String ditNumber;
        private double ditRate;

        public Builder ditName(String value)
        {
            this.ditName = value;
            return this;
        }
        public Builder ditNumber(String value)
        {
            this.ditNumber = value;
            return this;
        }
        public Builder ditRate(double value)
        {
            this.ditRate = value;
            return this;
        }
        public DIT build()
        {
            return new DIT(this);
        }

    }
}
