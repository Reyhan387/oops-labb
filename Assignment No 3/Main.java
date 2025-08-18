import java.util.Scanner;

class Student {
    String name;
    int roll_no;

    void inputBasicDetails(Scanner sc) {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        roll_no = sc.nextInt();
        sc.nextLine(); // consume newline
    }
}

class Sem1 extends Student {
    int m1, chem, c;

    int totalSem1() {
        return m1 + chem + c;
    }

    double percentageSem1() {
        return (totalSem1() / 300.0) * 100;
    }
}

class Sem2 extends Sem1 {
    int m2, physics, python;

    int totalSem2() {
        return m2 + physics + python;
    }

    double percentageSem2() {
        return (totalSem2() / 300.0) * 100;
    }

    void inputMarks(Scanner sc) {
        // Semester 2 marks
        System.out.print("Enter Mathematics II Marks: ");
        m2 = sc.nextInt();
        System.out.print("Enter Physics Marks: ");
        physics = sc.nextInt();
        System.out.print("Enter Python Marks: ");
        python = sc.nextInt();

        // Semester 1 marks
        System.out.print("Enter Mathematics I Marks: ");
        m1 = sc.nextInt();
        System.out.print("Enter Chemistry Marks: ");
        chem = sc.nextInt();
        System.out.print("Enter C Language Marks: ");
        c = sc.nextInt();
    }

    void displayMarks() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + roll_no);

        System.out.println("\nSemester 1 Marks:");
        System.out.println("Mathematics I: " + m1);
        System.out.println("Chemistry: " + chem);
        System.out.println("C Language: " + c);
        System.out.println("Total: " + totalSem1());
        System.out.printf("Percentage: %.2f%%\n", percentageSem1());

        System.out.println("\nSemester 2 Marks:");
        System.out.println("Mathematics II: " + m2);
        System.out.println("Physics: " + physics);
        System.out.println("Python: " + python);
        System.out.println("Total: " + totalSem2());
        System.out.printf("Percentage: %.2f%%\n", percentageSem2());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sem2 s2 = new Sem2();
        s2.inputBasicDetails(sc);
        s2.inputMarks(sc);
        s2.displayMarks();

        sc.close();
    }
}