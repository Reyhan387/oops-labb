abstract class Player{
public abstract void fitness();
public void getcountry(){
System.out.println("India");
}
}
public class Bowler extends Player{
public void  fitness(){
System.out.println("fitness of Bowler");
}
public static void main(String[] args){
Bowler b=new Bowler();
b.getcountry();
b.fitness();
}}