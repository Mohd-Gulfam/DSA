class Car {

    String color = "Red";

    void start() {
        System.out.println(color + " car started");
    }

    static void companyName() {
        System.out.println("Toyota");
    }
}
public class Hello {




    public static void main(String[] args) {
//        printMssage();
//        System.out.println("Hello World");
        Car.companyName();  // Static method

        Car c1 = new Car();
        c1.start();

    }
}
