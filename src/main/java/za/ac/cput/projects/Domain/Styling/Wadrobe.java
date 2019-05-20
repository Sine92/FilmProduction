package za.ac.cput.projects.Domain.Styling;

public class Wadrobe {

    private String wadName;
    private String wadNumber;
    private double wadRate;

    public Wadrobe()
    {

    }
    public Wadrobe(Builder build)
    {
        this.wadName=build.wadName;
        this.wadNumber=build.wadNumber;
        this.wadRate = build.wadRate;

    }

    public String getWadName() {
        return wadName;
    }

    public String getWadNumber() {
        return wadNumber;
    }

    public double getWadRate() {
        return wadRate;
    }
    public static class Builder{
        private String wadName;
        private String wadNumber;
        private double wadRate;

        public Builder wadName(String value)
        {
            this.wadName = value;
            return this;
        }
        public Builder wadNumber(String value)
        {
            this.wadNumber = value;
            return this;
        }
        public Builder wadRate(double value)
        {
            this.wadRate = value;
            return this;

        }
        public Wadrobe build()
        {
            return new Wadrobe(this);
        }


    }

}
