public class BooleanExpressionDemo {
    public static void main(String[] args) {
        // Boolean expressions
        boolean isJavaFun = true;
        boolean isHomeworkTiring = true;
        boolean isAGreater = 'a' > 'b'; // Comparing characters
        boolean areEqual = 'a' == 'b'; // Comparing characters
        
        // Logical AND (&&), OR (||), NOT (!), and XOR (^)
        boolean bothTrue = isJavaFun && isAGreater;
        boolean eitherTrue = isJavaFun || isHomeworkTiring;
        boolean notTrue = !isHomeworkTiring;
        boolean exclusiveOr = isJavaFun ^ isHomeworkTiring;
        
        // Output the results
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
