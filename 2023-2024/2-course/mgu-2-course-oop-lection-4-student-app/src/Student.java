public class Student {
    private int id;
    private String name;

    public void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.display();
    }
}
