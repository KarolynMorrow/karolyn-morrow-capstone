import java.util.Scanner;

public abstract class Client {

    private String firstName;
    private String lastName;
    private String email;
    final boolean isAdmin = false;


    /*CONSTRUCTORS*/

    public Client(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Client() {

    }
    /*METHODS*/

    public String getClientName(Scanner scanner) {
        
        System.out.println("Name: ");
        return scanner.nextLine();
    }

    ;

    public abstract void returnName();

    public abstract String returnClientInfo();


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
