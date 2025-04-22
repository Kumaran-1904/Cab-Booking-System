package Model;

import java.util.ArrayList;
import java.util.List;
import DAO.User;
import Controller.UserController;

public class UserDB implements UserController {
    private ArrayList<User> users = new ArrayList<>();

    @Override
    public void addDetails(User user) { // Corrected method name to match interface
        users.add(user);
        System.out.println("User added successfully.");
    }
    @Override
    public List<User> getUsers() { // Added method to retrieve all users
        return users;
    }
}
