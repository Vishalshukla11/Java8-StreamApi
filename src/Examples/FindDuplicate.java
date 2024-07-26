// TO Find all duplicate element from a given string

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

interface DuplicateString{
    Map<Character,Long> StringDuplicate(String input);
}
class FindDuplicate 
{
public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the String ");
  String name=sc.nextLine();

  //lambda implementation 
  DuplicateString duplicateString=(input) -> input.chars()
  .mapToObj(c -> (char) c)
  .collect(Collectors.groupingBy(c -> c,LinkedHashMap::new, Collectors.counting()));

  //filter the map to find charater with count > 1
  Map<Character,Long> duplicates = duplicateString.StringDuplicate(name).entrySet().stream()
    .filter(entry -> entry.getValue() > 1)

    // now collects the filtered entries back into a Map<Character,Long>
    .collect(Collectors.toMap(Map.Entry :: getKey,Map.Entry::getValue));

    //output the duplicate characters 
    System.out.println("Dupliate characters:");
    duplicates.forEach((Character ,count) -> {
        System.out.println(Character + " : " + count);
    });

  
}
}