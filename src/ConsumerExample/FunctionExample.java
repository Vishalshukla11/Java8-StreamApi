package ConsumerExample;

import java.util.function.Function;

class FunctionExample
{
    static Function<String,String> f1= name -> name.toUpperCase();
    static Function<String,String> f2= name -> name.toUpperCase().concat(" features");

    public static void main(String args[])
    {
        // System.out.println("result 1 : " + f1.apply("Java"));
        // System.out.println("Result 2 : " + f2.apply("java"));
      System.out.println(f1.andThen(f2).apply(" java"));    
     System.out.println("compose Result :" + f1.compose(f2).apply("java"));
    }
}