// Ques 24
class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}
class Test {
    static void check(int age) throws InvalidAgeException {
        if(age < 18) throw new InvalidAgeException("Not eligible");
        else System.out.println("Eligible");
    }
    public static void main(String[] args) {
        try {
            check(15);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
