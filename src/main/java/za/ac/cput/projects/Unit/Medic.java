package za.ac.cput.projects.Unit;

public class Medic {

    private String medName;
    private String medNumber;
    private double medRate;

    public Medic ()
    {

    }
    public Medic(Builder build)
    {
       this.medName=build.medName;
       this.medNumber = build.medNumber;
       this.medRate = build.medRate;
    }

    public String getMedName() {
        return medName;
    }

    public String getMedNumber() {
        return medNumber;
    }

    public double getMedRate() {
        return medRate;
    }

    public static class Builder{
        private String medName;
        private String medNumber;
        private double medRate;

        public Builder medName(String value)
        {
            this.medName = value;
            return this;
        }
        public Builder medNumber(String value)
        {
            this.medNumber = value;
            return this;
        }
        public Builder medRate(double value)
        {
            this.medRate = value;
            return this;
        }
        public Medic build()
        {
            return new Medic(this);
        }

    }
}
