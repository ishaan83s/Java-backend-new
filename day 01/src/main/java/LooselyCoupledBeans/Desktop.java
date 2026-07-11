package LooselyCoupledBeans;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements ComputerDevice {
    @Override
    public void display() {
        System.out.println("Desktop Bean display active.");
    }
}