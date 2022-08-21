import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[]args){

        ArrayList items = new ArrayList();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        printDouble(items);
    }

    private static void printDouble(ArrayList<Integer> items) {

//        for(Object i : items){
//            System.out.println((Integer)i * 2);


        for(int i : items){
            System.out.println(i*2);
        }
    }


}
