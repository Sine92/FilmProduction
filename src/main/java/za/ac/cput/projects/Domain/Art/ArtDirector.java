package za.ac.cput.projects.Domain.Art;


public class ArtDirector {
    private String artDirectorName ;
    private String artDirectorNumber;
    private double artDirectorRate;
    private String artId;

    public ArtDirector()
    {

    }
    public ArtDirector(Builder build)
    {
        this.artDirectorName = build.artDirectorName;
        this.artDirectorNumber = build.artDirectorNumber;
        this.artDirectorRate = build.artDirectorRate;
        this.artId = build.artId;

    }

    public String getArtId() {
        return artId;
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
        private String artId;

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
        public Builder artId(String value)
        {
            this.artId = value;
            return  this;
        }
        public Builder copy(ArtDirector artDirector)
        {
            this.artDirectorName = artDirector.artDirectorName;
            this.artDirectorNumber = artDirector.artDirectorNumber;
            this.artDirectorRate = artDirector.artDirectorRate;
            this.artId = artDirector.artId;
            return this;

        }
        public ArtDirector build()
        {
            return new ArtDirector(this);
        }


    }
}
