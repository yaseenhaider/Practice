class Circle {
    private double radius;

    // Constructor with no arguments, sets default radius to 1.0
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with one argument to set custom radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // Default radius
        Circle circle2 = new Circle(5); // Custom radius

        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
    }
}
