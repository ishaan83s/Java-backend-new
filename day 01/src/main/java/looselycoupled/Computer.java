package looselycoupled;

public class Computer {
    // Use the interface type here
    private Machine device;

    // Constructor accepts any ComputerDevice (Desktop or Laptop)
    public Computer(Machine device) {
        this.device = device;
    }

    public void display() {
        System.out.println("My device is us");
        device.display(); // Runs the display method of whatever was passed in
    }
}