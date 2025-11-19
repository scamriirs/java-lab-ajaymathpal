abstract class Shape {
    abstract void area();
}
class Triangle extends Shape {
    void area() {
        int b = 5, h = 4;
        System.out.println(0.5 * b * h);
    }
}
class Rectangle extends Shape {
    void area() {
        int l = 6, w = 3;
        System.out.println(l * w);
    }
}
class Circle extends Shape {
    void area() {
        double r = 3.5;
        System.out.println(3.14 * r * r);
    }
}
class TestShape {
    public static void main(String[] args) {
        Shape s;
        s = new Triangle(); s.area();
        s = new Rectangle(); s.area();
        s = new Circle(); s.area();
    }
}
