public class Main {
    public static void main(String[] args) {
        System.out.println("=== Memento Pattern Demo ===\n");
        
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        
        originator.setState("State #1");
        careTaker.add(originator.saveStateToMemento());
        
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        
        originator.setState("State #3");
        System.out.println("Current State: " + originator.getState());
        
        originator.getStateFromMemento(careTaker.get(0));
        originator.getStateFromMemento(careTaker.get(1));
    }
}
