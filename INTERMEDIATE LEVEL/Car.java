// Ques 13
class Vehicle {
    String vehicle_type;

    Vehicle(String v) {
        vehicle_type = v;
    }

    void display() {
        System.out.println("Vehicle Type: " + vehicle_type);
    }
}

class Car extends Vehicle {
    String model_type;
    String company;

    Car(String v, String m, String c) {
        super(v);
        model_type = m;
        company = c;
    }

    void display() {
        super.display();
        System.out.println("Company: " + company);
        System.out.println("Model Type: " + model_type);
    }

    public static void main(String[] args) {
        Car c = new Car("Four Wheeler", "Sedan", "Honda");
        c.display();
    }
}
