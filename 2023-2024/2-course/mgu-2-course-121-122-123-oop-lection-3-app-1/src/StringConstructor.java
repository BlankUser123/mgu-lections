public class StringConstructor {

    public String constructHelloSentence(String name) {
        String resultSentence = "Hello world! My name is " + name;
        System.out.println(resultSentence);
        return resultSentence;
    }

    public static void constructStaticSentence() {
        System.out.println("It's a static method");
    }
}

class Application {

    public static void main(String[] args) {
//        StringConstructor stringConstructor = new StringConstructor();
//        stringConstructor.constructHelloSentence("Den");

        StringConstructor.constructStaticSentence();
    }
}