import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Adam", "Małysz", 1L, Gender.male, 21, new Faculty("Electronics"), new ArrayList<Course>());
        student1.addCourse(new Course("Maths"));
        student1.addCourse(new Course("Physics"));
        student1.addCourse(new Course("Biology"));
        Student student2 = new Student("Zosia", "Samosia", 2L, Gender.female, 19, new Faculty("Architecture"), new ArrayList<Course>());
        student2.addCourse(new Course("Maths"));
        student2.addCourse(new Course("Chemistry"));
        Student student3 = new Student("Aleksander", "Szybki", 3L, Gender.male, 18, new Faculty("Mechanics"), new ArrayList<Course>());
        student3.addCourse(new Course("Maths"));
        student3.addCourse(new Course("Physics"));
        student3.addCourse(new Course("Constructions"));
        Student student4 = new Student("Ola", "Cola", 4L, Gender.female, 20, new Faculty("Electronics"), new ArrayList<Course>());
        student4.addCourse(new Course("Biology"));
        student4.addCourse(new Course("Constructions"));

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println("Objects of the student class, that their name starts with 'A':");
        students.stream()
                .filter(student -> student.getName().startsWith("A"))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("The name of te faculty of every student:");
        students.stream()
                .map(student -> student.getFaculty().getName())
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Students with max age and min age:");
        System.out.println("Max age: " +
                students.stream()
                        .max(Comparator.comparingInt(Student::getAge))
                        .get().getName());
        System.out.println("Min age: " +
                students.stream()
                        .min(Comparator.comparingInt(Student::getAge))
                        .get().getName());


        System.out.println();

        System.out.println("Grouping students by gender:");
        System.out.println(
                students.stream()
                        .collect(
                                Collectors.groupingBy(Student::getGender, Collectors.mapping(Student::getName, Collectors.toList()))
                        ));

        System.out.println();

        System.out.println("Grouping students by gender and average of students age:");
        System.out.println(
                students.stream()
                        .mapToDouble(Student::getAge)
                        .average()
                        .getAsDouble());

    }
}

