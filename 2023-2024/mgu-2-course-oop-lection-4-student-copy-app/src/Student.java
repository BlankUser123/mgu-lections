public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
    }

    public void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student firstStudent = new Student(111, "Karan");
        Student secondStudent = new Student(firstStudent);

        firstStudent.display();
        secondStudent.display();
    }
}
