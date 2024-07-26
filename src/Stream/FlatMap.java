import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class FlatMap{
public static void main(String args[])
{
    List<Integer> OddNumbers= Arrays.asList(1,3,5,7,9);
    List<Integer> evenNumber= Arrays.asList(2,2,4,6,8);

    List<List<Integer>> ListOfList= Arrays.asList(OddNumbers,evenNumber);
    System.out.println(" Before Flatten:" + ListOfList);
    //after flatten 
    List<Integer> flattenList= ListOfList.stream()
    .flatMap(list -> list.stream())
    .collect(Collectors.toList());
    System.out.println("After flatten Result: "  + flattenList);
}
}