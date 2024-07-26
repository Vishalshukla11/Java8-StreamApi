package Stream;

import java.util.stream.Stream;

class StreamExample
{
  public static void main(String args[])
  {
    Stream<Integer> s1= Stream.of(1,2,3,4,5,6,7,8,9,10);
    s1.forEach(p -> System.out.println(p));

    System.out.println("===============================");
    Stream<Integer> s2= Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9,10,11});
    s2.forEach(p -> System.out.println(p));
  }
}