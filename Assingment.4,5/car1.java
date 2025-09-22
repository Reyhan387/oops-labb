class Dream_car
{
   String a = Bmw;

 }
class cars extends Dream_car
 {
   String a = Tesla;

 
void display() 
{
  
 System.out.println(" dream car is: "
                           + super.a );

}
}
class Car1 {
    public static void main(String[] args)
    {
        Cars small = new Cars();
        small.display();
    }
}