public class NumberWrapper {
    int value;

    public NumberWrapper() {}
    public NumberWrapper(NumberWrapper other) {
        this.value = other.getValue();
    }

    public void setValue(int newValue) {
        this.value = newValue;
    }

    public int getValue() {
        return this.value;
    }

    public static void swap(NumberWrapper a, NumberWrapper b) {
        int temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }

    public static void main(String[] args) {
        NumberWrapper n1 = new NumberWrapper();
        NumberWrapper n2 = new NumberWrapper();
        n1.setValue(5);
        n2.setValue(10);
        
        NumberWrapper.swap(n1, n2);

        System.out.println("n1: " + n1.getValue());
        System.out.println("n2: " + n2.getValue());
    }
}
