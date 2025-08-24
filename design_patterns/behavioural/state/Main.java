public class Main {
    public static void main(String[] args) {
        System.out.println("=== State Pattern Demo ===\n");
        
        Context context = new Context();
        
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println("Current state: " + context.getState());
        
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println("Current state: " + context.getState());
    }
}
