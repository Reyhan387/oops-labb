public class NumberFormatExceptionDemo2 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("Reyhan");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number!");
        }
    }
}
