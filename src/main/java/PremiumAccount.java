import java.time.LocalDate;
import java.util.*;

public class PremiumAccount extends Client {
    /*Possible issues to consider:
    * Repeat of names (how to handle and differentiate)
    * */
    Map<String, Client> clientDataBase;
    //Key is "firstName" Value is Client class
    private boolean isActive;
    private LocalDate dateOfBirth;

    private String userName;
    private char[] passWord;
    final boolean isAdmin = false;
    private TreeMap<Date, Services> previousService;
    private int points;

    /*CONSTRUCTORS*/

    public PremiumAccount() {
        super();
        clientDataBase = new HashMap<>();

    }


    /*METHODS*/
    public Map<String, Client> printHashMap() {
        for (String keyName : clientDataBase.keySet()) {
            Client client = getClientDataBase().get(keyName);

        }
        return null;
    }


    /*GETTERS AND SETTERS*/

    public Map<String, Client> getClientDataBase() {
        return clientDataBase;
    }

    public void setClientDataBase(Map<String, Client> clientDataBase) {
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
