package looselycoupled;

public class Desktop implements Machine {
    @Override
    public void display() {
        System.out.println("Desktop display is running.");
    }
}