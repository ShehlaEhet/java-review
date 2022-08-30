package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //Zero Arg
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());


        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());


        //One arg

        Function<Integer, Car> f1 = model -> new Car(model);
        Car bmw = f1.apply(2009);
        System.out.println(bmw.getModel());

        Function<Integer, Car> f2 = Car::new;
        Car toyota = f1.apply(2016);
        System.out.println(toyota.getModel());

        //Two Arg

        BiFunction<String, Integer, Car> b1 = (make, model) -> new Car(make, model);
        Car honda = b1.apply("Honda", 2007);
        System.out.println(honda.getMake()+ " " + honda.getModel());

        BiFunction<String, Integer, Car> b2 = Car::new;
        Car nissan = b2.apply("Nissan", 2001);
        System.out.println(nissan.getMake() + " " + nissan.getModel());

    }
}
