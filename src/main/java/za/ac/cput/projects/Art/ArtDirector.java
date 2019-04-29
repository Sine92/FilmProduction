package za.ac.cput.projects.Art;

public class ArtDirector {
    private String artDirectorName ;
    private String artDirectorNumber;
    private double artDirectorRate;

    public ArtDirector()
    {

    }
    public ArtDirector(Builder build)
    {
        this.artDirectorName = build.artDirectorName;
        this.artDirectorNumber = build.artDirectorNumber;
        this.artDirectorRate = build.artDirectorRate;

    }

    public String getArtDirectorName() {
        return artDirectorName;
    }

    public String getArtDirectorNumber() {
        return artDirectorNumber;
    }

    public double getArtDirectorRate() {
        return artDirectorRate;
    }
    public static class Builder{
        private String artDirectorName;
        private String artDirectorNumber;
        private double artDirectorRate ;

        public Builder artDirectorName(String value)
        {
            this.artDirectorName = value;
            return this;

        }
        public Builder artDirectorNumber(String value)
        {
            this.artDirectorNumber = value;
            return this;
        }
        public Builder artDirectorRate(double value)
        {
            this.artDirectorRate = value;
            return this;
        }
        public ArtDirector build()
        {
            return new ArtDirector(this);
        }


    }
}
