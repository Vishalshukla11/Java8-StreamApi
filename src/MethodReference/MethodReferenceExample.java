package MethodReference;
import java.util.Comparator;

class MethodReferenceExample
{
    public static void main(String args[])
{
System.out.println("result 1 => " + MethodReferenceExample.compare(10,10));
//
Comparator<Integer> com= MethodReferenceExample :: compare;
System.out.println("Result 2=> " + com.compare(10, 20));
}
public static int compare(Integer x ,Integer y)
{
    return Integer.compare(x,y);
}
}
