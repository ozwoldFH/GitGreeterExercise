package at.fhj.iit;

public class GreeterImpl implements Greeter {

    private String name;

    public GreeterImpl(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {

    }

    @Override
    public void sayGoodbye() {
        System.out.println(String.format("Good Bye, %s!", name));
    }
}
