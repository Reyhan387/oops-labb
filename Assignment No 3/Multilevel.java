import java.util.Scanner;


class Student {
    String name;
    int rollNo;

    void getStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLong();
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
    }

    void displayStudentDetails() {
        System.out.println("Nmae: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

// Child 1 (inherits Student)
class Marks1 extends Student {
    int sub1, sub2, sub3;

    void getMarks1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        sub1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        sub2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        sub3 = sc.nextInt();
    }

    void displayMarks1() {
        System.out.println("Subject 1: " + sub1);
        System.out.println("Subject 2: " + sub2);
        System.out.println("Subject 3: " + sub3);
    }
}

class Marks2 extends Marks1 {
    int sub4, sub5;

    void getMarks2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Subject 4: ");
        sub4 = sc.nextInt();
        System.out.print("Enter marks for Subject 5: ");
        sub5 = sc.nextInt();
    }

    void displayMarks2() {
        System.out.println("Subject 4: " + sub4);
        System.out.println("Subject 5: " + sub5);
    }

    void displayTotal() {
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total Marks: " + total);
    }
}


public class Multilevel {
    public static void main(String[] args) {
        Marks2 student = new Marks2();

        student.getStudentDetails();
        student.getMarks1();
        student.getMarks2();

        System.out.println("\n--- Student Details ---");
        student.displayStudentDetails();

        System.out.println("\n--- Marks from Child 1 ---");
        student.displayMarks1();

        System.out.println("\n--- Marks from Child 2 ---");
        student.displayMarks2();

        System.out.println("\n--- Total Marks ---");
        student.displayTotal();
    }
}
