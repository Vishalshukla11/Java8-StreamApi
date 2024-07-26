package LocalVariables;

import java.util.function.Consumer;

class LocalVariablesExample{
     static int k=1;
public static void main (String args[])
{
 int i=10;
 Consumer<Integer> c1= (j) -> 
 {
    // i++;
    k=15;
    System.out.println("Print k: " + k);
    System.out.println("value is : " + (i+j));

 };
 c1.accept(15);
}
}