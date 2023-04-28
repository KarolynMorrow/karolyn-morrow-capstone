public class GuestAccount extends Client {

    //obtain input from client constructor
    public GuestAccount(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }

    @Override
    public void returnName() {
        System.out.println("Welcome " + getFirstName() + " " + getLastName());
    }

    @Override
    public String returnClientInfo() {
        return ("Guest name: " + getFirstName() + " " + getLastName() + " Input email: " + getEmail());
    }
}
