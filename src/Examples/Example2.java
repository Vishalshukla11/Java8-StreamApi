import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Example2
{

    public static void main(String args[])
    {
        
        List<String> names= Arrays.asList("AAA","AAA","Vishal","vikram","vipul","vinay","Vivek","Vishal","Vishal");
           //without java 8 try to remove the duplicate data 

           List<String> result= new ArrayList<>();

           for(String name : names)
           {
            if(!result.contains(name))
            {
                result.add(name);
            }
           }
           System.out.println("result without java 8 :- "  + result);


           //after java 8

           List<String> result2=names.stream()
           .distinct()
           .collect(Collectors.toList());
           System.out.println("after java 8 result is =>" + result2);


    }
}