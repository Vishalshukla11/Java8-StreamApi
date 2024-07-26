package Stream;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamFactoryMethod{
    static UnaryOperator<Integer> add = x -> x+5;

    public static void main(String args[])
    {//here if we will remove limit it will become infinite 
        Stream<Integer> s1= Stream.iterate(0,add).limit(10);
        s1.forEach(System.out::println);
    }

}