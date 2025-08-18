import java.utill.*;
 
 class Sem1
{
 int Chemistry;
 int M1;
 int C;
}
 
public class Sem2 extends Sem1
{
  int phy;
  int M2;
  int python;
public static void main (String args[])
{
  Sem2 s = new Sem2();
  s.chemistry = 56;
  s. M1=49;
  s.C=59;
 s. phy = 45;
 s. M2 =59;
 s.python = 40;

int Avg = (s.chemistry + s.M1 +s.C +s.phy +s.M2 +s.python)/6;
int Sum = s.chemistry + s.M1 +s.C +s.phy +s.M2 +s.python ;
  System.out.println("the average is  "+Avg);
  System.out.println("the sum is  "+Sum);
}
}

  