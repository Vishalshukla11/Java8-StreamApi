import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ConsumerExample.Person;
import ConsumerExample.PersonRepository;

class CollectionVsStream
{
  public static void main(String args[])
  {
    List<String> names= new ArrayList<>();
     names.add("Ajay");
     names.add("Bijay");
     names.add("John");
     names.add("Zorze");
     names.add("Vishal");

     for(String n:names)
     {
        //System.out.println(">>>> : " + n);
     }

     // by  using stream  
 System.out.println("after using stream api:");
     //Stream<String> stream = names.stream().sorted(); //also can sort the data  
     //stream.forEach(p -> System.out.println(">>>>>>>>> : " + p));

     List<String> personNames= PersonRepository
     .getAllPersons()
     .stream()
     .peek(per -> System.out.println(per))
     .map(Person :: getName)
     .collect(Collectors.toList());
     
  }  
}