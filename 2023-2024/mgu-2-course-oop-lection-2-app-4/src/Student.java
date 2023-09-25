public class Student {
    int id;
    String name;

    void insertRecord(int recordId, String recordName) {
        id = recordId;
        name = recordName;
    }

    void displayInformation() {
        System.out.println(id + " " + name);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.insertRecord(101, "John");
        student.displayInformation();
    }
}