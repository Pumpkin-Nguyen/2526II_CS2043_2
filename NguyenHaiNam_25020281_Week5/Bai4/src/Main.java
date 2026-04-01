public class Main {
    public static void main(String[] args) {
        String line = "Hello world. This is a java program. Hello java, hello world.";
        WordCounter wordCounter = new WordCounter();

        wordCounter.analyze(line);
        wordCounter.displayResult();
    }
}
