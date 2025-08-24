public class Main {
    public static void main(String[] args) {
        System.out.println("=== Iterator Pattern Demo ===\n");
        
        NameRepository namesRepository = new NameRepository();
        
        System.out.println("Names in repository:");
        for (Iterator<String> iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = iter.next();
            System.out.println("Name: " + name);
        }
    }
}
