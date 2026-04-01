import java.util.Stack;

public class MessageHistory {
    private Stack<Message> messageHistory;
    
    public MessageHistory() {
        this.messageHistory = new Stack<>();
    }

    public void add(Message message) {
        messageHistory.push(message);
    }

    public void undo() {
        messageHistory.pop();
    }

    public void peek() {
        System.out.println(messageHistory.peek());
    }

    public void print() {
        for (Message message : messageHistory) {
            System.out.println(message.getContent());
        }
    }
}