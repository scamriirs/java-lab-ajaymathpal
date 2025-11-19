class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error");
        } catch(Exception e) {
            System.out.println("Other Error");
        }
    }
}
