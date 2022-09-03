package task;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {

        //Find all transactions in the year 2011 and sort them by value(small to high)
        System.out.println("*****************Task - 1*****************");
        Data.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //What are all the unique cities where the traders work?
        System.out.println("*****************Task - 2*****************");
        Data.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //Find all traders from Cambridge and sort them by name
        System.out.println("*****************Task - 3*****************");
        Data.getAll().stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //Return a string of all trader's name sorted alphabetically
        System.out.println("*****************Task - 4*****************");
        String result = Data.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (name1, name2) -> name1 + name2 + " ");
        System.out.println(result);

        //Are any traders based in Milan
        System.out.println("*****************Task - 5*****************");
        boolean milanBased = Data.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);

        //Print the values of all transactions from the traders living in Cambridge
        System.out.println("*****************Task - 6*****************");
        Data.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //What is the highest value of all the transactions?
        System.out.println("*****************Task - 7*****************");
        Optional<Integer> highestValue = Data.getAll().stream()
                .map(transaction -> transaction.getValue())
                .reduce(Integer::max);
        System.out.println(highestValue.get());

        //Find the transaction with min value
        System.out.println("*****************Task - 8*****************");
        Optional<Transaction> smallVal = Data.getAll().stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(smallVal.get());

        //Shortcut way
        Optional<Transaction> smallValue= Data.getAll().stream()
                .min(comparing(Transaction::getValue));
        System.out.println(smallValue.get());

    }
}
