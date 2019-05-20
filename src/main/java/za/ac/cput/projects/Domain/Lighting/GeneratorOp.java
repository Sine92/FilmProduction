package za.ac.cput.projects.Domain.Lighting;

public class GeneratorOp {

    private String genName;
    private String genNumber;
    private double genRate;

    public GeneratorOp()
    {

    }
    public GeneratorOp(Builder build)
    {
      this.genName = build.genName;
      this.genNumber = build.genNumber;
      this.genRate = build.genRate;
    }

    public String getGenName() {
        return genName;
    }

    public String getGenNumber() {
        return genNumber;
    }

    public double getGenRate() {
        return genRate;
    }
    public static class Builder{
        private String genName;
        private String genNumber;
        private double genRate;

        public Builder genName(String value)
        {
            this.genName = value;
            return this;
        }
        public Builder genNumber(String value)
        {
            this.genNumber = value;
            return this;
        }
        public Builder genRate(double value)
        {
            this.genRate = value;
            return this;
        }
        public GeneratorOp build()
        {
            return new GeneratorOp(this);
        }

    }
}
