package ConsumerExample;

import java.util.function.Predicate;

class PredicateExamples {
    public static void main(String args[]) {
        Predicate<Integer> e1 = (a) -> (a > 50);
        Predicate<Integer> e2 = (a) -> (a < 100);
        Predicate<Integer> e3 = (a) -> (a == 0);

        boolean result = e1.test(12);
        boolean result2 = e2.test(20);
        boolean result3 = e3.test(20);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println("___________________________________________________________________");
        // ------------------------------------
        // and condition
        System.out.println("And Condition using predicate ");
        boolean result4 = e1.and(e2).and(e3).test(15);

        System.out.println("result = " + result4);
        System.out.println("___________________________________________________________________");

        // --------------------------
        // or condition
        System.out.println("OR condition using Predicate ");
        boolean result5 = e1.or(e2).test(15);

        System.out.println("result = " + result5);
        System.out.println("___________________________________________________________________");
        
        //---------------------------------------------
        // negate condition  it is work like a logical not aways return the opposit output 
        System.out.println(" or & negate  condition using Predicate ");
        boolean result6 = e1.or(e2).negate().test(15);

        System.out.println("result = " + result6);
        System.out.println("___________________________________________________________________");
        

    }

}