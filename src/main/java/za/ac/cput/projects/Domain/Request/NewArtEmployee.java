package za.ac.cput.projects.Domain.Request;

public class NewArtEmployee {

    private String number, firstName, lastName, artDirector, propMaster, props;

    public String getArtDirector() {
        return artDirector;
    }

    public void setArtDirector(String artDirector) {
        this.artDirector = artDirector;
    }

    public String getPropMaster() {
        return propMaster;
    }

    public void setPropMaster(String propMaster) {
        this.propMaster = propMaster;
    }

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setRole(String role) {
        role = role;
    }


    @Override
    public String toString()
    {
        return  "NewArtEmployee{"
                + "number='" + number+ '\''+
            ",firstName='"+firstName+'\''+
            ",lastName='"+lastName+'\''+
                ",ArtDirector='"+artDirector+'\''+
                ",PropMaster='"+propMaster+'\''+
                ",Props='"+props+'\''+ '}';


    }
    }

