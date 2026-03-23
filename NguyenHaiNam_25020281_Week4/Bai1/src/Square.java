public class Square extends Shape {
    public Square(int x, int y) {
        super(x, y);
    }

    public void draw() {
        System.out.printf("Vẽ hình vuông tại (%d, %d)\n", x, y);
    }

    public void erase() {
        System.out.printf("Xóa hình vuông tại (%d, %d)\n", x, y);
    }
}
