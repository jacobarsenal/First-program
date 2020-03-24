package hk.warp;

public class Hello {

    String text;
    
    public Hello(String string) {
        text = string;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");


        Hello one = new Hello("one");

        one.start();
        one.start();
        one.start();
        one.start();
        one.start();
        one.start();

        

        Hello two = new Hello("two");

        two.start();
        one.start();
        two.start();
        one.start();
        two.start();
        one.start();
        two.start();
        one.start();



        new Hello("XXX").start();


        one.text = "Three";

        one.start();
    }

    private void start() {
        System.out.println(text);
    }
}