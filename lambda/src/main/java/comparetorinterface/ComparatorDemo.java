package comparetorinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 0, 15, 5, 20);
        System.out.println(list);

        //Ascending sort
        Collections.sort(list);
        System.out.println(list);

        //Descending sort

        Collections.sort(list, new MyComparator());
        System.out.println(list);


       Collections.sort(list, ((o1, o2) -> (o1 > o2) ? -1 : (o1<o2) ? 1:0));

       //Ascending
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);

        //Descending
        list.sort((o2, o1) -> o1.compareTo(o2));
        System.out.println(list);

        List<Fruit> myInventory = Arrays.asList(
                new Fruit(80, Color.GREEN),
                new Fruit(155, Color.RED),
                new Fruit(120, Color.GREEN)
        );

        Comparator<Fruit> sortFruit = comparing((Fruit fruit) -> fruit.getWeight());
        myInventory.sort(sortFruit);
        System.out.println(myInventory);

        myInventory.sort(comparing(fruit -> fruit.getWeight()));
        myInventory.sort(comparing(Fruit::getWeight));

        //Reverse
        myInventory.sort(comparing(Fruit::getWeight).reversed());

        //Chaining
        myInventory
                .sort(comparing(Fruit::getWeight)
                        .reversed()
                        .thenComparing(Fruit::getColor));
        System.out.println(myInventory);






    }
}
