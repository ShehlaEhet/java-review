import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReview {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("test");
        linkedList.add("qtp");
        linkedList.add("selenium");
        linkedList.add("RPA");
        linkedList.add("RFT");

        System.out.println("Content of LinkedList: " + linkedList);

        linkedList.addFirst("XA");
        linkedList.addLast("Dev");

        System.out.println("Content of LinkedList: " + linkedList);

        //get
        System.out.println(linkedList.get(0));
        //set
        linkedList.set(0,"AI");
        System.out.println(linkedList.get(0));

        //remove the first and last element
        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println(linkedList);

        //remove it from specific position
        linkedList.remove(2);
        System.out.println(linkedList);

        //print all the values of LinkedList:
        //for loop
        System.out.println("Using for loop");
        for (int i = 0; i<linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }

        //for each loop
        System.out.println("Using for each loop");
        for (String str:linkedList){
            System.out.println(str);
        }

        //iterator
        System.out.println("Using iterator");
        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //while loop
        System.out.println("Using While Loop");
        int num = 0;
        while (linkedList.size()>num){
            System.out.println(linkedList.get(num));
            num++;
        }


    }
}
