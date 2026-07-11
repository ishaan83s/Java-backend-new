package LooselyCoupledBeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// We can mark Laptop as a component too, but Spring will need to know which one to pick!
@Component
public class Laptop implements ComputerDevice {
    @Override
    public void display() {
        System.out.println("Laptop Bean display active.");
    }
}