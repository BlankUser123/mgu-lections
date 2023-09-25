public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        System.out.println(length * width);
    }
}
