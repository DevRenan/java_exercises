package LambdasStreamsOptionals.OptionalChallenge;

public class User {
    private final Integer id;
    private final String name;
    private final String email;

    public User(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
