package tightcoupling;

public class Computer {
    Laptop l;

    public Computer(){
        //This method is creating constructor
        l = new Laptop();
    }
    public void display(){
        System.out.println("My device is us");
        l.display();
    }
}
