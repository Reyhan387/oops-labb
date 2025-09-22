class NullPointer_Demo {
    public static void main(String[] args) {
        try {
            String a = "Reyhan shaikh ";
            System.out.println(a.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }
}
