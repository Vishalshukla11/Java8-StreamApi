package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class StreamAllMatch_AnyMatch{
   static Predicate<String> p1= num -> num.length()>7;
    public static void main(String args[])
    {
      List<String> fruits= Arrays.asList("Apple","Banana","Graphes","oranges","Pineapple");
      System.out.println("using AllMatch length check: " + fruits.stream().allMatch(p1));
      System.out.println("using AnyMatch length check: " + fruits.stream().anyMatch(p1));
    }

}