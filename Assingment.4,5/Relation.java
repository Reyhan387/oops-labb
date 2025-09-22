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
Class GrandSon1 extends Son{
public void display(){
 System.out.println("this is grandson 1");
} 
} 
Class GrandSon2 extends Son{
public void show(){
 System.out.println("this is grandson 2");
} 
 


    public static void main(String[] args) {
        Son s1 = new Son();
        s1.bringWater();
        Grandson2 G1 = Grandson2();
        Grandson2 G2 = Grandson2();
         


        G1.display();
        G2.show();
        G1.bringWater();
        G2.bringWater();
         

    }
}
