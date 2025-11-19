class MultipleCatch {
    public static void main(String[] args) {

        // First exception
        try {
            int x = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        }

        // Second exception
        try {
            int a[] = new int[5];
            a[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error");
        }

        System.out.println("Program End");
    }
}
