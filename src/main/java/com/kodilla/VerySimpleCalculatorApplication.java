package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VerySimpleCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(VerySimpleCalculatorApplication.class, args);

        System.out.println("hello");
        double numberA = 3.3;
        double numberB = 4.4;
        System.out.println("Number A:" + numberA + " Number B:" + numberB);
        double resoult = add(numberA, numberB);
        System.out.println("Adding numbers:" + resoult);
        resoult = subtract(numberA, numberB);
        System.out.println("Subtract numbers:" + resoult);

    }
    private static double add(double numberA, double numberB) {
        return numberA + numberB;
    }

    private static double subtract(double numberA, double numberB) {
        return numberA - numberB;
    }
}
