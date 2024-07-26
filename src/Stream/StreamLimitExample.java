package Stream;

import java.util.Arrays;
import java.util.List;

class StreamLimitExample{
    public static void main(String args[])
    {
        List<String> fruits = Arrays.asList("Apple","Orange","Banana","PineApple");
        fruits.stream()
        .limit(3)
        .forEach(System.out::println);
        
        List<Integer> integr=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum=integr.stream()
        .limit(10)
        .reduce(0 ,(x,y) -> (x+y));
        System.out.println("sum: " + sum);

        //skip 
        List<Integer> integrs=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int skip=integr.stream()
        .skip(2)
        .reduce(0 ,(x,y) -> (x+y));
        System.out.println("sum after skip : " + skip);
    }

}