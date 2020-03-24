public class Hello {

    String text = "Hello again";
    public static void main(String[] args) {
        System.out.println("Hello World!");

        new Hello().start();
    }

    private void start() {
        System.out.println(text);
    }
}