class Vehicle {
    String vehicle_type;
    Vehicle(String v) {
        vehicle_type = v;
    }
    void display() {
        System.out.println("Vehicle type: " + vehicle_type);
    }
}
class  extends Vehicle {
    String model_type, company;
    Car(String v, String m, String c) {
        super(v);
        model_type = m;
        company = c;
    }
    void display() {
        super.display();
        System.out.println("Model: " + model_type);
        System.out.println("Company: " + company);
    }
    public static void main(String[] args) {
        Car c = new Car("Four Wheeler", "Sedan", "Honda");
        c.display();
    }
}
