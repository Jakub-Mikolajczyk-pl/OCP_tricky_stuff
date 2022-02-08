import questions.AbstractClass.Boeing;
import questions.FunctionalInterf;
import questions.Interfaces.Engine;
import questions.Interfaces.TurboProp;
import questions.PassingArguments;
import questions.SuperclassMembers;

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
        FunctionalInterf.doSomething();
    }

}
