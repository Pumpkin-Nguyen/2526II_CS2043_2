public class Main {
    public static void main(String[] args) {
        System.out.println("useString(): " + useString() + "ms");
        System.out.println("useStringBuffer(): " + useStringBuffer() + "ms");
        contentAnalysis();
    }

    public static long useString() {
        String text = "";
        int M = 100_000;
        long t1 = System.currentTimeMillis();
        for (int i = 0; i <= M; i++) {
            text.concat("Hello");
            // text += "Hello";
        }
        long t2 = System.currentTimeMillis();
        return t2 - t1;
    }

    public static long useStringBuffer() {
        StringBuffer text = new StringBuffer();
        int M = 100_000;
        long t1 = System.currentTimeMillis();
        for (int i = 0; i <= M; i++) {
            text.append("Hello");
        }
        long t2 = System.currentTimeMillis();
        return t2 - t1;
    }

    public static void contentAnalysis() {
        long t1 = System.currentTimeMillis();
        String text = "Have you ever heard of Hangul? It’s the Korean writing system, also known as the Korean alphabet. If you’re interested in learning Korean, understanding Hangul is absolutely essential. Hangul was specifically designed to be easy to learn. So even if you’re a complete beginner, you can start learning Hangul right away.\n" + //
                        "\n" + //
                        "In fact, learning Hangul is often the first step in learning Korean, and it can make a huge difference in your Korean learning journey. By the end of this article, you’ll understand what Hangul is, why it’s important for learning Korean, and how you can start mastering it today. So let’s dive in and explore the fascinating world of Hangul together!";

        String[] setences = text.split("[.!\\?]+");
        int setenceCount = setences.length;
        long t2 = System.currentTimeMillis();

        System.out.println("Count: " + setenceCount);
        System.out.println("Time to count: " + (t2 - t1));

        t1 = System.currentTimeMillis();
        text.replace("Java", "Python");
        t2 = System.currentTimeMillis();
        System.out.println("Replaced!");
        System.out.println("Time to replace: " + (t2 - t1));
    }
}
