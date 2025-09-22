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

 


    public static void main(String[] args) {
        Son s1 = new Son();
        s1.bringWater();
    }
}


