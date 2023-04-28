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

    //take input from client and input into either guestAccount object or premiumAccount object
    public Client() {
        System.out.println("Please input your name and email: ");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        String email = input.nextLine();
    }
    /*METHODS*/;

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
