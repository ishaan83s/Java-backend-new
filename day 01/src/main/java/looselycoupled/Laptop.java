package looselycoupled;

public class Laptop implements Machine {
    @Override
    public void display() {
        System.out.println("Laptop display is running.");
    }
}