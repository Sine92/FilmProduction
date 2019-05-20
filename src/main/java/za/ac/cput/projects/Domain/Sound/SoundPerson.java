package za.ac.cput.projects.Domain.Sound;

public class SoundPerson {
    private String spName;
    private String spNumber;
    private double spRate;

    public SoundPerson()
    {

    }
    public SoundPerson(Builder build)
    {
        this.spName = build.spName;
        this.spNumber = build.spNumber;
        this.spRate = build.spRate;

    }

    public String getSpName() {
        return spName;
    }

    public String getSpNumber() {
        return spNumber;
    }

    public double getSpRate() {
        return spRate;
    }
    public static class Builder{
        private String spName;
        private String spNumber;
        private double spRate;

        public Builder spName(String value)
        {
          this.spName = value;
          return this;
        }
        public Builder spNumber(String value)
        {
            this.spNumber = value;
            return this;
        }
        public Builder spRate(double value)
        {
            this.spRate = value;
            return this;

        }
        public SoundPerson build()
        {
            return new SoundPerson(this);
        }



    }
}
