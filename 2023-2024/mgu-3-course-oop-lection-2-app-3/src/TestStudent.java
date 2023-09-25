public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student();
        Student secondStudent = new Student();

        student.insertRecord(1, "John");
        secondStudent.insertRecord(2, "Michael");

        student.display();
        secondStudent.display();
    }
}
