package za.ac.cput.projects.Domain.Production;

public class Producer {

    private String prodName;
    private String prodNumber;
    private double prodRate;

    public Producer()
    {

    }
    public Producer(Builder build)
    {
      this.prodName = build.prodName;
      this.prodNumber = build.prodNumber;
      this.prodRate = build.prodRate;
    }

    public String getProdName() {
        return prodName;
    }

    public String getProdNumber() {
        return prodNumber;
    }

    public double getProdRate() {
        return prodRate;
    }
    public static class Builder{
        private String prodName;
        private String prodNumber;
        private double prodRate;

        public Builder prodName(String value)
        {
            this.prodName = value;
            return this;
        }
        public Builder prodNumber(String value)
        {
            this.prodNumber = value;
            return this;
        }
        public Builder prodRate(double value)
        {
            this.prodRate = value;
            return  this;
        }
        public Producer build()
        {
            return new Producer(this);
        }

    }
}
