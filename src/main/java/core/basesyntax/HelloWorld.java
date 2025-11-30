package core.basesyntax;

import java.time.LocalDate;

public class HelloWorld {

    private String greeting;
    private int currentYear;
    private int age;
    private int size;

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.initializeVariables();
        helloWorld.sayHello("Hello, Mate!");
        System.out.println(helloWorld.getFromOneToTen());
    }

    private String getFromOneToTen() {
        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }
        return result;
    }

    private void sayHello(String text) {
        System.out.println(
                "Hello, Mate! I am happy to see you! This class looks weird! "
                        + "Your task is to fix the checkstyle in this file. "
                        + "Your goal is to run `mvn clean package` "
                        + "and receive `BUILD SUCCESS` message"
        );
        System.out.println(text);
    }

    private void initializeVariables() {
        greeting = "Hello mates!";
        System.out.println(greeting);

        currentYear = LocalDate.now().getYear();
        System.out.println("It is " + currentYear + " year");

        age = 25;
        System.out.println("I'm " + age);

        size = 42;
        System.out.println("The size is " + size);
    }
}
