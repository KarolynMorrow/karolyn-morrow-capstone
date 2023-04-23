public class Client {
    private String firstName;
    private String lastName;


    /*CONSTRUCTORS*/
    public Client(){

    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    /*METHODS*/

    public void returnFullName(){
        System.out.println(getFirstName() + getLastName());
    }




    /*GETTERS AND SETTERS*/

    public String getFirstName() {
        return firstName;
    }

    public Client setFirstName(String firstName) {
        this.firstName = firstName;
        return null;
    }

    public String getLastName() {
        return lastName;
    }

    public Client setLastName(String lastName) {
        this.lastName = lastName;
        return null;
    }
}
