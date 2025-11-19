class  {
    int a;
    static int count;
    Demo(int a) {
        this.a = a;
        count++;
    }
    void show() {
        System.out.println(a + " " + count);
    }
    public static void main(String[] args) {
        Demo d1 = new Demo(10);
        Demo d2 = new Demo(20);
        d1.show();
        d2.show();
    }
}
