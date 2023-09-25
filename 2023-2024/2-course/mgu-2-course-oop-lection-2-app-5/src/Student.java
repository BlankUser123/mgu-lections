public class Student {
    int id;
    String name;

    public Student(int recordId, String recordName) {
        id = recordId;
        name = recordName;
    }

    public void display() {
        System.out.println(id + " " + name);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(101, "John");
        student.display();
    }
}
