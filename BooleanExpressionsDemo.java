public class BooleanExpressionsDemo {
    public static void main(String[] args) {
        // Step 2: Declare Boolean Variables
        boolean isJavaFun = true;
        boolean isHomeworkTiring = false;

        // Step 3: Declare Integer Variables
        int a = 15;
        int b = 20;

        // Step 4: Relational Expression (Greater Than)
        boolean isAGreater = a > b;

        // Step 5: Relational Expression (Equal To)
        boolean areEqual = a == b;

        // Step 6: Logical AND
        boolean bothTrue = isJavaFun && (a < b);

        // Step 7: Logical OR
        boolean eitherTrue = isJavaFun || isHomeworkTiring;

        // Step 8: Logical NOT
        boolean notTrue = !isHomeworkTiring;

        // Step 9: Logical XOR
        boolean exclusiveOr = isJavaFun ^ isHomeworkTiring;

        // Step 10: Output Results
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is homework tiring? " + isHomeworkTiring);
        System.out.println("Is 'a' greater than 'b'? " + isAGreater);
        System.out.println("Are 'a' and 'b' equal? " + areEqual);
        System.out.println("Both conditions (isJavaFun && a<b): " + bothTrue);
        System.out.println("Either condition (isJavaFun || isHomeworkTiring): " + eitherTrue);
        System.out.println("Logical NOT of isHomeworkTiring: " + notTrue);
        System.out.println("Exclusive OR (isJavaFun ^ isHomeworkTiring): " + exclusiveOr);
    }
}
