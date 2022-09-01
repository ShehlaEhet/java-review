import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {

        //AllMatch
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);


        //AnyMatch
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian))
            System.out.println("The menu is vegetarian friendly.");


        //NoneMatch
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        //FindAny
        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println(dish.get());

        //FindFirst
        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();
        System.out.println(dish2.get());


    }


}
