import questions.*;
import questions.AbstractClass.Boeing;
import questions.AnonymousClasses.AnonymousClasses;
import questions.Interfaces.Engine;
import questions.Interfaces.TurboProp;
import questions.LambdaExpressions.LambdaExpressions;
import questions.TryWithResources.TryWithResources;

public class Main {
    public static void main(String[] args)
    {
//        LogicalOperators.shortCircuitedOR();
//        LogicalOperators.orderOfOperations();

//        FieldsVsVariables.partialInitializationWithElse();

//        Strings.trickyConcatenation();
//        Strings.trickyPlusSumConcatenation();
//        Strings.newStrings();
//        Strings.stripTrim();

//        DateAndTime.inits();
//        DateAndTime.formatDateTimeDefault();
//        DateAndTime.formatDateTimeCustom();

//        PassingArguments.swapPrimitives();
//        PassingArguments.swapWithTypeReference();

//        SuperclassMembers.Hi hi = new SuperclassMembers.Hi();
//        hi.sayHello();

        // Abstract Class
//        Boeing boeing = new Boeing("747");
//        boeing.takeOff();

        // Interface
//        System.out.println(Engine.canStart(-30));
//        System.out.println(TurboProp.canStart(-30)); // ERROR - Static method may be invoked on containing interface
        // class only

        // Functional Interface
//        FunctionalInterf.doSomething();

        //Inner Classes
//        InnerClasses innerClasses = new InnerClasses();
//        InnerClasses.InnerClass innerClass = innerClasses.new InnerClass();
//        innerClass.Hello();

        //Local Class
//        LocalClass localClass = new LocalClass();
//        localClass.method();

        //Anonymous Classes
//        AnonymousClasses anonymousClasses = new AnonymousClasses();
//        anonymousClasses.someMethod();

//        //Lambda Expressions
//        LambdaExpressions lambdaExpressions = new LambdaExpressions();
//        lambdaExpressions.printMessage("Short message due to char limit", (message -> "Sms message: " + message));
//        lambdaExpressions.printMessage("This is a tweet", (message -> "Twitter post: " + message));

        //Exception Handling
//        ExceptionHandling exceptionHandling = new ExceptionHandling();
//        exceptionHandling.catchWrongly();

        //Finally Block
//        FinallyBlock finallyBlock = new FinallyBlock();
//        finallyBlock.avoidFinally();

        //Exception Handling flow
//        ExceptionHandlingFlow.flow();

        //Try with resources
        TryWithResources.tryIt();
    }

}
