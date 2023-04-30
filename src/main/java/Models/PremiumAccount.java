package Models;

import java.time.LocalDate;
import java.util.Date;
import java.util.TreeMap;

public class PremiumAccount {

    private boolean isActive;
    private LocalDate dateOfBirth;
    private String email;
    private String userName;
    private char[] passWord;

    private TreeMap<Date, Services> previousService;
    private int points;


    /*CONSTRUCTORS*/
//obtain input from client class constructor and input into clientDataBase hashMap with email and password as premiumAccountInfo

    public PremiumAccount(String firstName, String lastName, String email, String userName) {

        this.userName = userName;
    }


    public PremiumAccount() {

    }


    /*METHODS*/



    /*GETTERS AND SETTERS*/

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
