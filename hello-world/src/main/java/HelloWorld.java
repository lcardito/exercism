public class HelloWorld {

    public static String hello(String s) {
        return (s == null || s.trim().isEmpty()) ? "Hello, World!" : "Hello, " + s + "!";
    }

}
