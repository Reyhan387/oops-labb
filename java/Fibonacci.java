import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
         int a = 0, b = 1,n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of iterations: ");
        n=s.nextInt();
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        s.close();
    }

}