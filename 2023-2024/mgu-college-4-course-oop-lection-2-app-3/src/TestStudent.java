public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student();
        Student secondStudent = new Student();

        student.id = 1;
        student.name = "John";

        secondStudent.id = 2;
        secondStudent.name = "Michael";

        System.out.println(student.id + " " + student.name);
        System.out.println(secondStudent.id + " " + secondStudent.name);
    }
}
