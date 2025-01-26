package LambdasStreamsOptionals.OptionalChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {

    private List<User> users = new ArrayList<>();

    public Optional<User> findById(Integer id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    public Optional<User> findByEmail(String email) {
        return users.stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    public void save(User user) {
        users.add(user);
    }

}
