package at.fhj.iit;

public class GreeterImpl implements Greeter {

    private String name;

    public GreeterImpl(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, Clemens Ott");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Good Bye, Clemens Ott");
    }
}
