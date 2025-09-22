abstract class BankAccount{
 public abstract void deposite();
 public abstract void withdrawl();
 public abstract void getBalance();
public void getDetails(){
String name = "reyhan sahikh";
String Mo_No = "9699631685";
String Address = "Kopargaon";
System.out.println("Name : "+name);
System.out.println("Mobile No "+Mo_No);
System.out.println("Address "+Address);
}
}
class SavingAccount extends BankAccount{
 public  void deposite(){
System.out.println("50000 Deposited");
}
public  void withdrawl(){
   System.out.println("50000 Withdrawl");
}
public  void getBalance(){
System.out.println("Current Balance : 40000");
}
}
class CurrentAccount extends BankAccount{
 public  void deposite(){
System.out.println("50000 Deposited");
}
public  void withdrawl(){
   System.out.println("30000 Withdrawl");
}
public  void getBalance(){
System.out.println("Current Balance : 20000");
}
}
class TestAbstract{
public static void main (String args[]){
SavingAccount sa = new SavingAccount();
CurrentAccount ca = new CurrentAccount();
System.out.println("Saving Account ");
sa.getDetails();
sa.deposite();
sa.withdrawl();
sa.getBalance();
System.out.println("Current Account");
ca.getDetails();
ca.deposite();
ca.withdrawl();
ca.getBalance();
}
}