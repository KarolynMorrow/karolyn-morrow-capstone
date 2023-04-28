import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Client> clientHashMap = new HashMap<>();

        Client arykah = new GuestAccount("Arykah", " Hill", "ahill@email.com");
        Client tyhe = new PremiumAccount("Tyhe", " Morganson", "tyMorg@email.com", "tyMorg");

        //Input accounts into clientHashMap
        clientHashMap.put("Arykah", arykah);
        clientHashMap.put("Tyhe", tyhe);

        //Get size of clientHashMap
        int size = clientHashMap.size();
        System.out.println(size);

        //Obtain information in clientHashMap
        Client client1 = clientHashMap.get("Arykah");
        Client client2 = clientHashMap.get("Tyhe");


        System.out.println(client1.returnClientInfo());
        System.out.println(client2.returnClientInfo());


        client1.setLastName(" Jones");
        System.out.println(client1.returnClientInfo());


        clientHashMap.remove("Arykah");
        int size1 = clientHashMap.size();
        System.out.println(size1);


//        arykah.returnName();
//        System.out.println(arykah.returnClientInfo());
//        System.out.println(ty.returnClientInfo());
//
//        ty.setLastName("Morrison");
//
//        System.out.println(ty.returnClientInfo());


    }
}
