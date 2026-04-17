interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double width, height;
    public Rectangle(double w, double h) { this.width = w; this.height = h; }
    public double getArea() { return width * height; }
}

class Triangle implements Shape {
    private double base, height;
    public Triangle(double b, double h) { this.base = b; this.height = h; }
    public double getArea() { return 0.5 * base * height; }
}

class Circle implements Shape {
    private double radius;
    public Circle(double r) { this.radius = r; }
    public double getArea() { return Math.PI * radius * radius; }
}