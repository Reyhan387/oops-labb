import java.util.*; 
public class conditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int a,b,c;
        System.out.println("Enter the first number:");
        a = sc.nextInt();
         System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();

       int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
         System.out.println("greatest no is:"+val);


    }
} 