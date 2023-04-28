public class Main {
    public static void main(String[] args) {

        Client arykah = new GuestAccount("Arykah", "Jones", "arykahj@email.com");
        Client ty = new PremiumAccount("Ty", "James", "tyjames@email.com", "tyJames");

        arykah.returnName();
        System.out.println(arykah.returnClientInfo());
        System.out.println(ty.returnClientInfo());

        ty.setLastName("Morrison");

        System.out.println(ty.returnClientInfo());


    }
}
