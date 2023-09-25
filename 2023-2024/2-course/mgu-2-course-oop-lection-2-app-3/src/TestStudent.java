public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student();
        student.id = 101;
        student.name = "John";

        Student secondStudent = new Student();
        secondStudent.id = 102;
        secondStudent.name = "Michael";

        System.out.println(student.id + " " + student.name);
        System.out.print(secondStudent.id + " " + secondStudent.name);
    }
}
