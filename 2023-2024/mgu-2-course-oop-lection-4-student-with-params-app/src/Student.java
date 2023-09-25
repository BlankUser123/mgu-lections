public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student student = new Student(1, "John");
        student.display();
    }
}
