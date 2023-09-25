public class Student {
    int id;
    String name;

    public void insertRecord(int recordId, String recordName) {
        id = recordId;
        name = recordName;
    }

    public void display() {
        System.out.println(id + " " + name);
    }
}
