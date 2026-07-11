package LooselyCoupledBeans;



import org.springframework.context.ApplicationContext;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Main.class,args);

        Computer obj = context.getBean(Computer.class);

        obj.display();



    }

}