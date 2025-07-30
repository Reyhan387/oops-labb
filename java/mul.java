import java.util.Scanner; 
public class mul {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:"); 
        int num = s.nextInt(); 

        System.out.println("Multiples of 5 up to " + num + ":"); 
        for (int i = 0; i <= num; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println(); 
        s.close();
    }
}