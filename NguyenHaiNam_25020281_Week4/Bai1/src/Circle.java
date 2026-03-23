public class Circle extends Shape {
    public Circle(int x, int y) {
        super(x, y);
    }

    public void draw() {
        System.out.printf("Vẽ hình tròn tại (%d, %d)\n", x, y);
    }

    public void erase() {
        System.out.printf("Xóa hình tròn tại (%d, %d)\n", x, y);
    }
}
