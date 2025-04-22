package Controller;
import java.util.*;
import DAO.User;

public interface UserController {
    void addDetails(User user);
    List<User> getUsers();
}
