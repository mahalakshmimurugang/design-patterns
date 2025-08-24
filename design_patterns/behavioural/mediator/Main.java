public class Main {
    public static void main(String[] args) {
        System.out.println("=== Mediator Pattern Demo ===\n");
        
        ChatMediator mediator = new ChatMediatorImpl();
        
        ChatUser user1 = new ChatUser(mediator, "John");
        ChatUser user2 = new ChatUser(mediator, "Jane");
        ChatUser user3 = new ChatUser(mediator, "Bob");
        
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        
        user1.send("Hello everyone!");
        user2.send("Hi John!");
        user3.send("Good morning team!");
    }
}
