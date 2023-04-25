public abstract class Client {

    private String firstName;
    private String lastName;
    private String email;


    /*CONSTRUCTORS*/
    public Client(){

    }

    public Client(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    /*METHODS*/

    public void returnFullName(){
        System.out.println(getFirstName() + getLastName());
    }




    /*GETTERS AND SETTERS*/

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
