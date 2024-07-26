package ConsumerExample;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

class UnaryBinaryExample
{
    static UnaryOperator<String> u01 = (name) -> name.toUpperCase();
    static UnaryOperator<Integer> u02 =(n)-> n+10;
    static Comparator<Integer> comp=(a,b) -> a.compareTo(b);
   public static void main(String args[])
   {
    System.out.println("result 1 =>" + u01.apply("vishal shukla "));
    System.out.println("result 2 => " + u02.apply(20));
   
    BinaryOperator<Integer> bo1 =BinaryOperator
    .maxBy((a,b) -> (a>b)?1:(a==b)?0 :-1);
    System.out.println("Binary operator result 1:" + bo1.apply(102,105));

    BinaryOperator<Integer> bo2 =BinaryOperator.maxBy(comp);
     System.out.println("Binary operator MaxBy result 2:" + bo2.apply(102,15));

    BinaryOperator<Integer> bo3 =BinaryOperator.minBy(comp);
    System.out.println("Binary operator MinBy result:"+ bo3.apply(103,10));


   } 
}