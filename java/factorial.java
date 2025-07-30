import java.util.Scanner;

public class factorial{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
         int a,factorial=1;
        System.out.println("Enter the number:");
        a = sc.nextInt();
         
        for(int i=1;i<=a;i++){
            factorial=factorial*i;
        }
        System.out.println("factorial is:"+factorial);
    }
}