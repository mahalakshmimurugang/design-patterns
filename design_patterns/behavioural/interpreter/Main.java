public class Main {
    public static void main(String[] args) {
        System.out.println("=== Interpreter Pattern Demo ===\n");
        
        // Parse and evaluate expressions
        String[] expressions = {
            "5 3 +",      // 5 + 3 = 8
            "10 4 -",     // 10 - 4 = 6
            "7 2 + 3 -"   // (7 + 2) - 3 = 6
        };
        
        for (String expr : expressions) {
            Expression expression = ExpressionParser.parse(expr);
            int result = expression.interpret();
            System.out.println("Expression: " + expr + " = " + result);
        }
    }
}
