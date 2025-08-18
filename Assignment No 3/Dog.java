class Animal
{
  void Voice()
{ 
  System.out.println(" in voice() in Animal");
}
}

public class Dog extends Animal
{
   void bark ()
{
    System.out.println(" in bark() in dog");
 
}
public static void main(String args[] )
{ 
  Dog d = new Dog();
  d.Voice();
  d.bark ();
}
}