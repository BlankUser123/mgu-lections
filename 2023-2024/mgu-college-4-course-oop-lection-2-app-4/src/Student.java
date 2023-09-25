public class Student {
    int id;
    String name;

    void insertRecord(int recordId, String recordName) {
        id = recordId;
        name = recordName;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
