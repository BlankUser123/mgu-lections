public class TestStudent {

    public static void main(String[] args) {
       Student student = new Student();
       Student second = new Student();

       student.id = 1;
       student.name = "John";

       second.id = 2;
       second.name = "Michael";

       System.out.println(student.id);
       System.out.println(student.name);

       System.out.println(second.id);
       System.out.println(second.name);
    }
}
