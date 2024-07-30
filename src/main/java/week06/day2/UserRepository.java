package week06.day2;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }


    public User getUserByName(String name) {

        for (User user : users) {
            if (user.getUserName().equalsIgnoreCase(name)){
                return user;
            }
        }

        throw new IllegalArgumentException("Cannot find user: " + name);
    }


}
