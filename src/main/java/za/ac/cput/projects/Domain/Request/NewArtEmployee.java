package za.ac.cput.projects.Domain.Request;

public class NewArtEmployee {

    private String number, firstName, lastName, role;

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

    public String getRole() {
        return role;
    }
    @Override
    public String toString()
    {
        return  "NewArtEmployee{"
                + "number='" + number+ '\''+
            ",firstName='"+firstName+'\''+
            ",lastName='"+lastName+'\''+
            ",role='"+role+'\''+'}';


    }
    }

