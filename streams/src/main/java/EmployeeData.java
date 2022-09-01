import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@gmail.com", Arrays.asList("202912345", "202913213")),
                new Employee(100, "Ozzy", "ozzy@gmail.com", Arrays.asList("703483838", "202334493")),
                new Employee(100, "Peter", "peter@gmail.com", Arrays.asList("516912345", "202334490"))
        );
    }
}
