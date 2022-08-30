package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.add(new User("Miranda", "Hobbs", 35));
        users.add(new User("Samantha", "Jones", 38));
        users.add(new User("Carrie", "Bradshaw", 34));
        users.add(new User("Veronica","Evan", 31));

        //Using builder
        users.add(User.builder().firstName("Mike").lastName("Smith").age(34).build());

        //Print all elements in the list
        printName(users, p -> true);

        System.out.println("*******************************");

        //print all users that last name starts with E
        printName(users, user -> user.getLastName().startsWith("E"));
    }

    private static void printName(List<User> users, Predicate<User> p){
        for (User user : users){
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
