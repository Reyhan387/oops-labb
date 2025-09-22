abstract class BankAccount
{ 
public abstract void deposite();
public abstract void withdrawl();
public  abstract void getBlalance();
public  void getDetils();
  {
     System.out.println("name, Moblie, Address ,etc ");

} 
}

class SavingAccount extends BankAccount
{ 
   public  void deposite() {

    System.out.println( " rupess 50000 is deposite ");
}
public  void withdrawl(){
      System.out.println( " rupess 50000 is withdrawl ");

}

public  void getBlalance(){
  System.out.println( " rupess 0 is avalable ");

}   
 
class CurrentAccount extends BankAccount{
 public  void deposite(){
System.out.println("5000 Deposited");
}
public  void withdrawl(){
   System.out.println("3000 Withdrawl");
}
public  void getBalance(){
System.out.println("Current Balance : 2000");
}
}
class Test1Abstract{
public static void main (String args[]){
SavingAccount s = new SavingAccount();
CurrentAccount c = new CurrentAccount();
System.out.println("Saving Account ");
s.getDetails();
s.deposite();
s.withdrawl();
s.getBalance();
System.out.println("Current Account");
c.getDetails();
c.deposite();
c.withdrawl();
c.getBalance();
}
}