import java.util.Scanner;

public class greatest1{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
         int a,b,c;
        System.out.println("Enter the first number:");
        a = sc.nextInt();
         System.out.println("Enter the second number:");
        b = sc.nextInt();
         System.out.println("Enter the third number:");
        c = sc.nextInt();
        
        if (a >= b && a >= c) { 
            System.out.println(a + " is the greatest.");
        } else if (b >= a && b >= c) { 
            System.out.println(b + " is the greatest.");
        } else { 
            System.out.println(c + " is the greatest.");
        }
    }
}