//  FInd first non-repeat element from a given string

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

class FirstNonRepeatingString
{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter String");
    String name=sc.nextLine();

    //create a map to store character counts in insertion order
    Map<Character,Long> charCountMap= name.chars()
    .mapToObj(c -> (char) c)

    //created a new LinkedHashMap to store the accumulated results 
    .collect(LinkedHashMap ::  new,
      (map, character) -> map.put(character ,map.containsKey(character)? map.get(character) + 1 : 1),
      LinkedHashMap::putAll
    );

    //find the first non repeating character 
   Optional<Character> firstNonRepeating=charCountMap.entrySet().stream()
     .filter(entry -> entry.getValue() == 1)
     .map(Map.Entry :: getKey)
     .findFirst(); //The main purpose of .findFirst() is to retrieve the first element of the stream.

     //output the dirst non-repeating character 
     firstNonRepeating.ifPresentOrElse(
        character -> System.out.println("First non- repeating character: " + character),
        () -> System.out.println("No non repeating Character found. ")

     );



    
  }
}