import java.io.*;

// Interface Declared
interface testInterface {
  
    // public, static and final
    final int a = 10;

    void display();
}

class TestClass implements testInterface {
  
    public void display(){ 
      System.out.println("Geek"); 
    }
}

class Geeks
{
    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }
}