interface Father {
    void bringWater();
}

interface Mother {
    void bringWater();
}

public class Son implements Father, Mother {
    public void bringWater() {
        System.out.println("Bring water for father and mother");
    }
}

class GrandSon1 extends Son {
    public void display() {
        System.out.println("This is grandson 1");
    }
}

class GrandSon2 extends Son {
    public void show() {
        System.out.println("This is grandson 2");
    }
}

public class Relation{
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.bringWater();

        GrandSon1 g1 = new GrandSon1();
        GrandSon2 g2 = new GrandSon2();

        g1.display();
        g2.show();

        g1.bringWater();
        g2.bringWater();
    }
}
