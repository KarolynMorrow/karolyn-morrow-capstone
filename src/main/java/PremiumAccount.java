import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PremiumAccount extends Client {
    /*Possible issues to consider:
     * Repeat of names (how to handle and differentiate)
     * */
    Map<Integer, PremiumAccount> clientDataBase = new HashMap<>();
    //Key is Client class Value is PremiumAccount class
    private boolean isActive;
    private LocalDate dateOfBirth;
    private String email;
    private String userName;
    private char[] passWord;

    private TreeMap<Date, Services> previousService;
    private int points;
    private static Integer userId = 1;

    /*CONSTRUCTORS*/
//obtain input from client class constructor and input into clientDataBase hashMap with email and password as premiumAccountInfo

    public PremiumAccount(String firstName, String lastName, String email, String userName) {
        super(firstName, lastName, email);
        this.userName = userName;
    }

    public void addPremiumClient(PremiumAccount premiumAccountInfo) {
        clientDataBase.put(userId, premiumAccountInfo);
        userId++;
    }

    public PremiumAccount() {
        super();
    }

    @Override
    public void returnName() {
        System.out.println("Welcome back " + getFirstName());
    }

    @Override
    public String returnClientInfo() {
        for (Map.Entry<Integer, PremiumAccount> info : clientDataBase.entrySet()) {
            Integer key = info.getKey();
            PremiumAccount value = info.getValue();
        }
        return ("Account Holder: " + getFirstName() + " " + getLastName() + " Email: " + getEmail() + " Username: " + getUserName());
    }


    /*METHODS*/
    public Map<Integer, PremiumAccount> printHashMap() {
        for (Integer keyName : clientDataBase.keySet()) {
            Client client = getClientDataBase().get(keyName);

        }

        return null;
    }


    /*GETTERS AND SETTERS*/

    public Map<Integer, PremiumAccount> getClientDataBase() {
        return clientDataBase;
    }

    public void setClientDataBase(Map<Integer, PremiumAccount> clientDataBase) {
        this.clientDataBase = clientDataBase;
    }

    public boolean isActive() {
        return isActive;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char[] getPassWord() {
        return passWord;
    }

    public void setPassWord(char[] passWord) {
        this.passWord = passWord;
    }

    public TreeMap<Date, Services> getPreviousService() {
        return previousService;
    }

    public void setPreviousService(TreeMap<Date, Services> previousService) {
        this.previousService = previousService;
    }

    public int getPoints() {
        return points;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setPoints(int points) {
        this.points = points;


    }

}
