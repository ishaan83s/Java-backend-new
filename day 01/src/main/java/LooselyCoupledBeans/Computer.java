package LooselyCoupledBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // Makes Computer a Spring Bean too
public class Computer {

    private ComputerDevice device;

    @Autowired // Spring automatically injects the dependency here!
    public Computer(@Qualifier("desktop") ComputerDevice device) {
        this.device = device;
    }

    public void display() {
        System.out.println("My device is us");
        device.display();
    }
}