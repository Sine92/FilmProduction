package za.ac.cput.projects.Domain.Camera;

public class DIT {

    private String ditName;
    private String ditNumber;
    private double ditRate;
    private String ditId;

    public String getDitId() {
        return ditId;
    }



    public DIT()
    {

    }
    public DIT(Builder build)
    {
        this.ditName = build.ditName;
        this.ditNumber = build.ditNumber;
        this.ditRate = build.ditRate;
        this.ditId = build.ditId;

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
        private String ditId;


        public Builder ditId(String value)
        {
            this.ditId = value;
            return this;
        }
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
