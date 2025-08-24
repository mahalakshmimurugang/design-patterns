Pattern Name: Interpreter
Pattern Category: Behavioral

Description:
    - The Interpreter pattern provides a way to evaluate language grammar or expressions.
    - It defines a representation for grammar along with an interpreter that uses the representation to interpret sentences.
    - Think of it like a calculator that can understand and evaluate mathematical expressions.
    - It's useful when you need to interpret a simple language or grammar.

The key idea is:
    - "Define a grammar representation and provide an interpreter to evaluate expressions in that grammar."

The Problem:
    - You need to interpret expressions in a simple language.
    - You want to represent grammar rules as objects.
    - You need to evaluate expressions without hardcoding the logic.
    - You want to extend the language with new grammar rules.
    - You need to parse and interpret structured data.

The Solution:
    - Create an abstract syntax tree (AST) representing the grammar.
    - Define an Expression interface with an interpret() method.
    - Create terminal expressions for basic elements (numbers, variables).
    - Create non-terminal expressions for operations (addition, subtraction).
    - Use a parser to build the AST from input strings.

Code Flow Explanation:

What This Example Does:
This example demonstrates a simple mathematical expression interpreter that can parse and evaluate postfix notation expressions like "5 3 +" (which means 5 + 3).

Step-by-Step Code Flow:

1. Expression Interface (Expression.java)
   - Purpose: Defines the contract for all expressions
   - Method: interpret() returns the evaluated result
   - Represents: The abstract expression

2. NumberExpression Class (NumberExpression.java)
   - Purpose: Terminal expression representing numbers
   - Behavior: interpret() returns the stored number
   - Represents: Leaf nodes in the expression tree

3. AddExpression Class (AddExpression.java)
   - Purpose: Non-terminal expression for addition
   - Behavior: interpret() adds left and right expressions
   - Represents: Internal nodes in the expression tree

4. SubtractExpression Class (SubtractExpression.java)
   - Purpose: Non-terminal expression for subtraction
   - Behavior: interpret() subtracts right from left expression
   - Represents: Internal nodes in the expression tree

5. ExpressionParser Class (ExpressionParser.java)
   - Purpose: Builds the expression tree from input strings
   - Behavior: Uses stack to parse postfix notation
   - Represents: The parser that creates the AST

Real-World Example: Mathematical Expression Calculator

Imagine you're building a calculator application that:
- Supports mathematical expressions
- Can parse different notation formats
- Allows users to define custom operations
- Needs to evaluate expressions efficiently
- Should be extensible for new operations

Without Interpreter Pattern:
You'd need complex parsing logic, hardcoded evaluation rules, and difficulty adding new operations!

With Interpreter Pattern:
You can easily add new operations, parse different formats, and maintain clean separation of concerns!

Benefits:
- Extensibility: Easy to add new grammar rules
- Maintainability: Grammar rules are represented as objects
- Separation of Concerns: Parsing and evaluation are separate
- Reusability: Expression objects can be reused
- Flexibility: Can support different input formats

Use Cases:
- Mathematical Expressions: Evaluating mathematical formulas
- Query Languages: Interpreting database queries
- Configuration Files: Parsing configuration syntax
- Domain-Specific Languages: Interpreting custom languages
- Rule Engines: Evaluating business rules

Drawbacks:
- Complexity: Can become complex for large grammars
- Performance: May be slower than direct evaluation
- Learning Curve: Understanding AST structure
- Memory Usage: Creates many objects for complex expressions

How to Execute the Code:
1. Navigate to the interpreter folder in terminal:
   cd behavioural/interpreter

2. Compile all Java files:
   javac *.java

3. Run the main program:
   java Main

Expected Output:
=== Interpreter Pattern Demo ===

Expression: 5 3 + = 8
Expression: 10 4 - = 6
Expression: 7 2 + 3 - = 6

Key Takeaways:
1. Grammar Representation: Grammar rules are represented as objects
2. AST Structure: Expressions form a tree structure
3. Terminal vs Non-terminal: Different types of expressions
4. Parser Role: Parser builds the expression tree
5. Interpretation: Each expression knows how to evaluate itself

Interpreter Pattern Structure:
- Expression Interface: Defines interpret() method
- Terminal Expressions: Represent basic elements
- Non-terminal Expressions: Represent operations
- Context: Contains global information
- Parser: Builds the expression tree

Simple Analogy:
Think of it like a language translator:
- Grammar Rules = Expression classes (how to understand the language)
- Sentences = Input strings to interpret
- Translation = interpret() method that evaluates expressions
- Dictionary = Parser that understands the structure
- Result = Understanding and evaluation of the input
