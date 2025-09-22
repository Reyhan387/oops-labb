class Dream_car {
    String a;

    Dream_car(String a) {
        this.a = a;
    }
}

class Car1 extends Dream_car {
    String b;

    // Constructor for Car1
    Car1(String a, String b) {
        super(a); // Call Dream_car constructor
        this.b = b;
    }

    void display() {
        System.out.println("Dream car is: " + super.a);
        System.out.println("Another car is: " + this.b);
    }
}

public class Main {
    public static void main(String[] args) {
        Car1 small = new Car1("Bmw", "Tesla");
        small.display();
    }
}