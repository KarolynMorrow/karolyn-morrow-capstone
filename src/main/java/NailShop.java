import Models.Client;

import java.util.HashMap;
import java.util.Map;

public abstract class NailShop implements Client {

    private String firstName;
    private String lastName;
    private String email;
    public static Integer userId = 1;

    Map<Integer, Client> accounts = new HashMap<>();
    //key is userID, Value is Client
    Map<Integer, Appointment> appointments = new HashMap<>();
    //key is userId value is Date

    public NailShop() {
    }


    /*METHODS*/

    public void addClient(Client client) {
        accounts.put(userId, client);
        userId++;
    }


    public void updateClient(Client client) {
        if (userId != null) {
            accounts.replace(userId, client);

        }

    }

    public void getClient() {
        if (userId != null) {
            accounts.get(userId);
        }

    }

    public void getAllClients() {
        for (int id : accounts.keySet()) {
            System.out.println("Client id: " + id + " Client info: " + accounts.get(id));
        }

    }

    public void deleteClient(Integer userId) {
        if (userId != null) {
            for (int id : accounts.keySet()) {
                accounts.remove(id);
            }
        }

    }

    public void addAppointment(Appointment appointment) {
        appointments.put(userId, appointment);
    }


    public void updateAppointment(Appointment appointment) {
        if (userId != null) {
            appointments.replace(userId, appointment);

        }

    }

    public void getAppointment() {
        if (userId != null) {
            appointments.get(userId);
        }

    }

    public void getAllAppointments() {
        for (int id : appointments.keySet()) {
            System.out.println("Client id: " + id + " Appointments: " + appointments.get(id));
        }

    }

    public void deleteAppointment(Integer userId) {
        if (userId != null) {
            for (int id : appointments.keySet()) {
                appointments.remove(id);
            }
        }

    }


}
