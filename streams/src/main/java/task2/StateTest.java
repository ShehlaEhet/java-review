package task2;

import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        State ga = new State();
        ga.addCity("Alpharetta");
        ga.addCity("Atlanta");
        ga.addCity("Johns Creek");
        ga.addCity("Duluth");


        State tx = new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Houston");
        tx.addCity("Austin");

        List<State> list = Arrays.asList(ga, tx);

        list.stream().map(state -> state.getCities()).forEach(System.out::println);

        list.stream()
                .map(state -> state.getCities())
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
