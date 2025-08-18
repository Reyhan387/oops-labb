class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

class Bike extends Vehicle {
    Bike() {
        System.out.println("This Vehicle is Bike");
    }
}

class Bus extends Vehicle {
    Bus() {
        System.out.println("This Vehicle is Bus");
    }
}

public class Test {
    public static void main(String[] args) {
        Bike obj1 = new Bike(); 
        Bus obj2 = new Bus(); 
    }
}