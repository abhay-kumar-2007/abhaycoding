
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello, Java in VS Code!");
    }
}

// Final class example
final class FinalClass {
    void show() {
        System.out.println("This is a final class");
    }
}

// Abstract class example
abstract class AbstractClass {
    abstract void display();
}

class ChildClass extends AbstractClass {
    void display() {
        System.out.println("Abstract method implemented!");
    }
}
