import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Client> clientName= new HashMap<>();

        Client arykah = new Client("Arykah", " Hill");
        Client tyhe = new Client("Tyhe", " Morganson");
        clientName.put("Arykah", arykah);
        clientName.put("Tyhe", tyhe);

        int size = clientName.size();
        System.out.println(size);

        Client client1 = clientName.get("Arykah");
        Client client2 = clientName.get("Tyhe");

        String client1FullName = client1.getFirstName() + client1.getLastName();
        String client2FullName = client2.getFirstName() + client2.getLastName();

        System.out.println(client1FullName + " and " + client2FullName);


        System.out.println(client1.getFirstName() + client1.getLastName());
        client1.setLastName(" Jones");

        System.out.println(client1.getFirstName() + client1.getLastName());

        clientName.remove("Arykah");
        int size1 = clientName.size();
        System.out.println(size1);







    }
}
