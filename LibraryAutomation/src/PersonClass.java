
public class PersonClass {

private  String firstName;

    private  String lastName;


public PersonClass(String firstName,String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;

}

public  String getFirstName(){
    return firstName;
}

public String getLastName()
{
    return lastName;
}




    public String toString() {
        return "Person  " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
             ;
    }

}