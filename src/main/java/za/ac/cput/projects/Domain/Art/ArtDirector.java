package za.ac.cput.projects.Domain.Art;


public class ArtDirector {
    private String artDirectorName ;
    private String artDirectorNumber;

    private String artId;
    private String artDRole;

    public String getArtDRole() {
        return artDRole;
    }

    public ArtDirector()
    {

    }
    public ArtDirector(Builder build)
    {
        this.artDirectorName = build.artDirectorName;
        this.artDirectorNumber = build.artDirectorNumber;

        this.artId = build.artId;
        this.artDRole = build.artDRole;

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


    public static class Builder{
        private String artDirectorName;
        private String artDirectorNumber;

        private String artId;
        private String artDRole;

        public Builder artDRole(String value)
        {
            this.artDRole = value;
            return this;
        }
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

        public Builder artId(String value)
        {
            this.artId = value;
            return  this;
        }
        public Builder copy(ArtDirector artDirector)
        {
            this.artDirectorName = artDirector.artDirectorName;
            this.artDirectorNumber = artDirector.artDirectorNumber;

            this.artId = artDirector.artId;
            return this;

        }
        public ArtDirector build()
        {
            return new ArtDirector(this);
        }


    }
}
