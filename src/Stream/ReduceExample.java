package Stream;

import java.util.Arrays;
import java.util.List;

class ReduceExample
{
public static void main(String args[])
{
    List<Integer> l1= Arrays.asList(1,2,3,4,5);
    // now i want th sum of the numbers 
    int sum=l1.stream()
    .mapToInt(i ->i).sum();
    System.out.println("sum Result: " + sum);
    System.out.println("Count of Indexs -> " + l1.stream().mapToInt(i -> i).count());
    System.out.println("result of multiplication "  + l1.stream().reduce(1,(a,b) -> a*b));
    //form 1 it will start and a.b are value and it will multipuly 
    //1*1=1
    //1*2=2
    //2*3=6
    //6*4=24
    //24*5=120
    System.out.println("result of Addition : " + l1.stream().reduce(0,(a,b) -> a+b));
    
}
}