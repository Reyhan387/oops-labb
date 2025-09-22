public class Array1 {

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5 };

        try {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

            System.out.println(a[2]);  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
