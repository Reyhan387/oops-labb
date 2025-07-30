import java.util.Scanner;

public class greatest{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
         int a,b;
        System.out.println("Enter the first number:");
        a = sc.nextInt();
         System.out.println("Enter the second number:");
        b = sc.nextInt();
         
       if(a>b){
            System.out.println(a+" is greater");
}else{
         System.out.println(b+"is grater");

}

    }
}