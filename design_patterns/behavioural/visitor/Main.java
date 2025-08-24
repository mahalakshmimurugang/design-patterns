public class Main {
    public static void main(String[] args) {
        System.out.println("=== Visitor Pattern Demo ===\n");
        
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
