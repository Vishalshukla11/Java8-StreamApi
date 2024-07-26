package Stream;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import ConsumerExample.PersonRepository;
import ConsumerExample.Person;

//import ConsumerExample.PersonRepository;

class StreamExample2
{
        public static void main(String args[])
    {
    // now use perform with the help of predicate 
    Predicate<Person> p1=(per) ->per.getHeight() >=140;
    Predicate<Person> p2= (per2) -> per2.getGender().equals("Male");
 

      //  ---------------------------------------------------------------
   Map<String,List<String>> personMap = PersonRepository
      .getAllPersons()
      .stream()
      .filter(p1)
      .collect(Collectors.toMap(Person::getName, Person::getHobbies));
      System.out.println("Person map:"+ personMap);


      
    }
}