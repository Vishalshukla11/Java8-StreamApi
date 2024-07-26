import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ConsumerExample.Person;
import ConsumerExample.PersonRepository;

class MapStreamApiExample{

    // example by usign PersonRepository 
    public static List<String> toUpperTransform(List<Person> listOfPersons)
    {
        return listOfPersons.stream()
        .map(Person::getName)
        .map(String :: toUpperCase)
        .collect(Collectors.toList());
    }
    //set 
    public static Set<String> toUpperTransformSet(List<Person> listOfPersons)
    {
        return listOfPersons.stream()
        .map(Person::getName)
        .map(String :: toUpperCase)
        .collect(Collectors.toSet());
    }
public static void main(String args[])
{
   List<String> fruits = Arrays.asList("Appleeeeeeeeeeee","Orange","Banana","pinapple");
 List<Integer> fruitsLength=  fruits.stream()
   .map(String :: length)
   .collect(Collectors.toList());
   System.out.println("length List:" + fruitsLength);
   

   //using for each 
    fruits.stream()
   .map(String :: length)
   .collect(Collectors.toList()).forEach(System.out::println);

   //call method
   System.out.println("To UpperCase Result : " + toUpperTransform(PersonRepository.getAllPersons()));
   System.out.println("To UpperCase Set Result : " + toUpperTransformSet(PersonRepository.getAllPersons()));

}
}