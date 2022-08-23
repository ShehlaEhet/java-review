import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        //Add Elements to ArrayList
        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Sayed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));

        System.out.println(students);

        //1. For loop with get(index)
        for (int i = 0; i<students.size(); i++) System.out.println(students.get(i));

        //2. Iterator
        //Forward Iteration
        Iterator iterator = students.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Backwards Iteration
        System.out.println("Printing with Iterator Backwards........");
        while (((ListIterator<?>) iterator).hasPrevious()){
            System.out.println(((ListIterator<?>) iterator).previous());
        }

        //3. for each loop
        System.out.println("Printing with For Each Loop.........");
        for (Student student : students) System.out.println(student);


        //4. Lambda

        System.out.println("Printing with Lambda........");
        students.forEach(student -> System.out.println(student));

        //Sorting Elements in List
        System.out.println("Printing with sorted List by comp");
        Collections.sort(students, new sortByIdDesc());
        System.out.println(students);


        System.out.println("Printing with sorted List by Name Desc");
        Collections.sort(students, new sortByNameDesc());
        System.out.println(students);

        }

        static class sortByIdDesc implements Comparator<Student>{

            @Override
            public int compare(Student o1, Student o2) {
                return o1.id - o2.id;
            }
        }

        static class sortByNameDesc implements Comparator<Student>{

            @Override
            public int compare(Student o1, Student o2) {
                return o2.name.compareToIgnoreCase(o1.name);
            }
        }

    }

