package LambdasStreamsOptionals.OptionalChallenge;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static UserRepository userRepository = new UserRepository();
    public static void main(String[] args) {
        var users = generateMockUsers(5);
        findByEmail(users.getFirst().getEmail());
        findByEmail("teste@teste.com");
        userRepository.findById(3).ifPresent(Main::printSucessMessage);
        findById(5);
        findById(99);

    }

    private static void printSucessMessage(User user) {
        System.out.println("Usuário encontrado: "+user);
    }

    private static void findByEmail(String email) {
        String msg = userRepository.findByEmail(email)
                .map(user -> "Usuário encontrado "+ user.getName()+" (Email: "+ user.getEmail()+")")
                .orElse("Nenhum usuário encontrado com o email: "+email);
        System.out.println(msg);
    }

    private static void findById(Integer id) {
        try{
            String msg = userRepository.findById(id)
                    .map(user -> "Usuário encontrado "+ user)
                    .orElseThrow(()-> new RuntimeException("Nenhum usuário encontrado com o id: "+id));
            System.out.println(msg);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }

    public static List<User> generateMockUsers(int count) {
        Faker faker = new Faker();
        List<User> users = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String name = faker.name().fullName();
            String email = faker.internet().emailAddress();
            users.add(new User(i, name, email));
        }
        users.stream().forEach(user -> userRepository.save(user));
        System.out.println(users);
        return users;
    }
}
