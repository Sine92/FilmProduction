package za.ac.cput.projects.Grips;

public class KeyGrip {

    private String kgName;
    private String kgNumber;
    private double kgRate;

    public KeyGrip()
    {

    }
    public KeyGrip(Builder build)
    {
      this.kgName = build.kgName;
      this.kgNumber = build.kgNumber;
      this.kgRate = build.kgRate;
    }

    public String getKgName() {
        return kgName;
    }

    public String getKgNumber() {
        return kgNumber;
    }

    public double getKgRate() {
        return kgRate;
    }
    public static class Builder{
        private String kgName;
        private String kgNumber;
        private double kgRate;

        public Builder kgName(String value)
        {
            this.kgName = value;
            return this;
        }
        public Builder kgNumber(String value)
        {
            this.kgNumber = value;
            return this;
        }
        public Builder kgRate(double value)
        {
            this.kgRate = value;
            return this;

        }
        public KeyGrip build()
        {
            return new KeyGrip(this);
        }


    }
}
