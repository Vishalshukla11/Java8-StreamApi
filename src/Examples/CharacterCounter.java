// TO Count the occurrence of each character in a string

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface CharacterCounter {
    // method declaration 
    Map<Character,Long> CountCharacters(String input);   
}
class CharOrrrenceCount
{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the String");
    String name=sc.nextLine();
    
    //lambda Implementation 
    CharacterCounter characterCounter= (input) -> input.chars()
        .mapToObj(c -> (char) c) // convert each Ascii valu back to charcater 
        //for maintaining the insersion order we will use LinjedHashMap
        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));

        //store the data in map 
        Map<Character,Long> characterCount= characterCounter.CountCharacters(name);

        //print the data 
        // here character and count are the parameters of lambda expression 
        // character represents each key (character) in the map 
        // count represent the corresponing value associted with each character key  
        characterCount.forEach((character, count) -> {
            System.out.println(character + " : " + count);
        });
    sc.close();
}
}