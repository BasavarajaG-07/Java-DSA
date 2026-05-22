class Vehicle {
    String brand = "Honda";

    void start() {
        System.out.println("Vehicle is starting...");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();
        System.out.println("Brand: " + v.brand);
    }
}
