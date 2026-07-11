package looselycoupled;

public class Main {
    public static void main(String[] args) {
        // 1. Create the specific device objects
        Desktop d = new Desktop();
        Laptop l = new Laptop();

        // 2. Pass the desktop 'd' into the Computer constructor
        Computer obj = new Computer(d);

        // 3. Call the display method
        obj.display();
    }
}