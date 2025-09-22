class Cricketers{

int virat_runs = 75;
 
}

public class Batsman extends Cricketers{

int virat_runs = 80;
void display()
{
System.out.println("The Batsman runs is: " +super.virat_runs);

}

public static void main(String[] args){

Batsman b=new Batsman();
b.display();


}
}