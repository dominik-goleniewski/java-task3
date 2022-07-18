import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private Long ID;
    private Gender gender;
    private int age;
    private Faculty faculty;
    ArrayList<Course> courses = new ArrayList<>();

    public Student(String name, String surname, Long ID, Gender gender, int age, Faculty faculty, ArrayList<Course> courses) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.gender = gender;
        this.age = age;
        this.faculty = faculty;
        this.courses = courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Long getID() {
        return ID;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
